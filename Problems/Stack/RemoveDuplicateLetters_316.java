package Problems.Stack;

import java.util.Stack;

public class RemoveDuplicateLetters_316 {
    public static void main(String[] args) {
        String s = "bcabc";
        System.out.println(removeDuplicateLetters(s));
    }
    public static String removeDuplicateLetters(String s) {
        int[] lastIdx = new int[26];
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            int idx = ch - 'a';
            lastIdx[idx] = i;
        }
        boolean[] present = new boolean[26];
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            int idx = ch - 'a';
            if(present[idx] == false){
                while(st.size() >0 && st.peek() > ch && lastIdx[(int)(st.peek() - 'a')] > i){
                    present[(int)(st.peek() - 'a')] = false;
                    st.pop(); 
                }
                st.push(ch);
                present[idx] = true;
            }
        }
        StringBuilder sb = new StringBuilder();
        while(st.size() > 0){
            sb.append(st.pop());
        }

        return sb.reverse().toString();
    }
}
