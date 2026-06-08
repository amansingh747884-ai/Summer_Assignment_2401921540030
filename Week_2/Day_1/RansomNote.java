package Week_2.Day_1;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;

        int[] Rfreq = new int[26];
        for (char c : ransomNote.toCharArray()) {
            Rfreq[c - 'a']++;
        }

        int[] Mfreq = new int[26];
        for (char c : magazine.toCharArray()) {
            Mfreq[c - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            if (Rfreq[i] > Mfreq[i]) {
                return false;
            }
        }
        return true;
    }
}
