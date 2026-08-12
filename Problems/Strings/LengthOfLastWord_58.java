package Problems.Strings;

public class LengthOfLastWord_58 {
    public static void main(String[] args) {
        String str = "Hello World ";
        LengthOfLastWord_58 obj = new LengthOfLastWord_58();
        System.out.println(obj.lengthOfLastWord(str));

    }
    public int lengthOfLastWord(String s) {
        int count =0;
        for(int i =s.length()-1; i>=0; i--){
            if(s.charAt(i) != ' '){
                count++;
            }else if(count != 0){
                break;
            }
        }
        return count;
    }
}
