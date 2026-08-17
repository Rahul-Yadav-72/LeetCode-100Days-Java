import java.util.HashMap;

public class ValidAnagram_242 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) + 1);
            } else {
                hm.put(ch, 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) - 1);
            } else {
                return false;
            }
        }

        for (int value : hm.values()) {
            if (value != 0) {
                return false;
            }
        }

        return true;
    }
}