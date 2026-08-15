class RedistributeCharactersToMakeAllStringsEqual_1897{
    public static void main(String[] args) {
        String[] words = {"abc", "aac", "bc"};
        System.out.println(makeEqual(words));
    }
    public static boolean makeEqual(String[] words) {
        int[] count = new int[26];
        for(int i = 0; i < words.length; i++) {
            String w = words[i];
            for(int j = 0; j < w.length(); j++) {
                count[w.charAt(j) - 'a']++;
            }

        }
        for(int i = 0; i < 26; i++) {
            if(count[i] % words.length != 0) {
                return false;
            }
        }
        return true;
    }
}