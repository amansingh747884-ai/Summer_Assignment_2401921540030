package Week_2.Day_4;

public class ReverseStringIII {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int i = 0;
        
        while (i < s.length()) {
            StringBuilder sb = new StringBuilder();

            while (i < s.length() && s.charAt(i) != ' ') {
                sb.append(s.charAt(i));
                i++;
            }
           
            ans.append(sb.reverse());
           
            if (i < s.length() && s.charAt(i) == ' ') {
                ans.append(" ");
                i++;
            }
        }
        return ans.toString();
    }
}