package Week_2.Day_1;

import java.util.HashMap;

public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        FirstUniqueCharacter solution = new FirstUniqueCharacter();
        String s = "loveleetcode";
        int result = solution.firstUniqChar(s);
        System.out.println("The index of the first unique character is: " + result);
    }
}