package Week_2.Day_4;

public class DecodeString {
    public String decodeString(String s) {
        StringBuilder ans = new StringBuilder();
        int i = 0;

        while (i < s.length()) {
            if (Character.isDigit(s.charAt(i))) {
                int num = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                i++;
                StringBuilder sb = new StringBuilder();
                int openBrackets = 1;

                while (i < s.length() && openBrackets > 0) {
                    if (s.charAt(i) == '[') {
                        openBrackets++;
                    } else if (s.charAt(i) == ']') {
                        openBrackets--;
                    }
                    if (openBrackets > 0) {
                        sb.append(s.charAt(i));
                    }
                    i++;
                }

                String decodedString = decodeString(sb.toString());
                for (int j = 0; j < num; j++) {
                    ans.append(decodedString);
                }
            } else {
                ans.append(s.charAt(i));
                i++;
            }
        }
        return ans.toString();
    }
}
