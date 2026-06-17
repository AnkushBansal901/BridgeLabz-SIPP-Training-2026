import java.util.LinkedHashMap;
import java.util.Map;

public class SpyAgencyEncoder {

    static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    static boolean isPalindrome(String s) {
        String clean = s.toLowerCase().replaceAll("\\s+", "");
        return clean.equals(new StringBuilder(clean).reverse().toString());
    }

    static void countVowelsConsonants(String s) {
        int vowels = 0, consonants = 0;
        for (char c : s.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if ("aeiou".indexOf(c) != -1) vowels++;
                else consonants++;
            }
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }

    static boolean areAnagrams(String a, String b) {
        int[] freq = new int[26];
        for (char c : a.toLowerCase().toCharArray()) if (c >= 'a' && c <= 'z') freq[c - 'a']++;
        for (char c : b.toLowerCase().toCharArray()) if (c >= 'a' && c <= 'z') freq[c - 'a']--;
        for (int f : freq) if (f != 0) return false;
        return true;
    }

    static char firstNonRepeating(String log) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : log.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);
        for (Map.Entry<Character, Integer> e : map.entrySet())
            if (e.getValue() == 1) return e.getKey();
        return '-';
    }

    public static void main(String[] args) {
        String message = "racecar";
        String intercept1 = "listen";
        String intercept2 = "silent";
        String log = "surveillance";

        System.out.println("Original Message  : " + message);
        System.out.println("Reversed Message  : " + reverse(message));
        System.out.println("Is Palindrome     : " + isPalindrome(message));
        countVowelsConsonants(message);
        System.out.println("Are Anagrams      : " + areAnagrams(intercept1, intercept2));
        System.out.println("First Non-Repeat  : " + firstNonRepeating(log));
    }
}
