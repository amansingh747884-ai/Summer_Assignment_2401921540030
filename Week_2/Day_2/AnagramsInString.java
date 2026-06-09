package Week_2.Day_2;
import java.util.*;
public class AnagramsInString {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (p.length() > s.length()) return result;

        int[] countP = new int[26];
        int[] countS = new int[26];

        for (char c : p.toCharArray()) {
            countP[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {

            countS[s.charAt(i) - 'a']++;

            if (i >= p.length()) {
                countS[s.charAt(i - p.length()) - 'a']--;
            }

            if (matches(countP, countS)) {
                result.add(i - p.length() + 1); 
            }
        }

        return result;
    }

    private boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}
