import java.util.Stack;

class MinimumAddToMakeParenthesesValid_921{
    public static void main(String[] args) {
        String s = "(((())";
        System.out.println(minAddToMakeValid(s));
    }
    public static int minAddToMakeValid(String s){
        Stack<Character> st = new Stack<>();
        int count = 0 ;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(ch);
            }else if(ch == ')' && st.size()>0){
                st.pop();
            }else{
                count++;
            }
        }
        return count + st.size();


    }
}