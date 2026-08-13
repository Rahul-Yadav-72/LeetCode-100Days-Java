class ReverseWordsInAString_151{
    public static void main(String[] args) {
        String s = "  hello world  ";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        String[] arr = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = arr.length - 1; i >= 0; i--){
            sb.append(arr[i]+" ");
        }
        String str = sb.toString();
        return str.trim();
    }
}