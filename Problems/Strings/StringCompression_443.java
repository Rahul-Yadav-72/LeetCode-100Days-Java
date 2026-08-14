package Problems.Strings;

public class StringCompression_443 {
    public static void main(String[] args) {
        char[] chars = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };
        System.out.println(compress(chars));
    }

    public static int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        Integer count = 1;
        sb.append(chars[0]);
        for (int i = 1; i < chars.length; i++) {
            if (chars[i - 1] == chars[i]) {
                count++;
                
            }else{
                if (count > 1) {
                    sb.append(count.toString());
                    count = 1;
                }
                sb.append(chars[i]);
            }
            

        }
        for (int i = 0; i < sb.length(); i++) {
            chars[i] = sb.charAt(i);
        }
        return sb.length();
    }
}
