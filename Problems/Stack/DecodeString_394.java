import java.util.Stack;
class DecodeString_394{
    public static void main(String[] args){
        String s = "3[a2[c]]";
        System.out.println(decodeString(s));
    }
    public static String decodeString(String s) {
        Stack<Integer> numberStack = new Stack<>();
        Stack<String> mainStack = new Stack<>();

        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= '0' && ch <= '9'){
                int num = 0;
                while(i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                i--;
                numberStack.push(num);
            }else if(ch != ']'){
                mainStack.push(ch + "");
            }else{
                StringBuilder sb = new StringBuilder();
                while(!mainStack.isEmpty() && !mainStack.peek().equals("[")){
                    sb.insert(0, mainStack.pop());
                }
                mainStack.pop();
                int count = numberStack.pop();
                String str = sb.toString();
                StringBuilder temp = new StringBuilder();
                for(int j=0; j<count; j++){
                    temp.append(str);
                }
                mainStack.push(temp.toString());    
            }
        }
        StringBuilder result = new StringBuilder();
        while(!mainStack.isEmpty()){
            result.insert(0, mainStack.pop());
        }
        return result.toString();
    
    }
}