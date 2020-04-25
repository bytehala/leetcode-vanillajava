package leetcode.longestpalindrome;

public class Solution {

    public String longestPalindrome(String s) {
        if(s.isEmpty()) {
            return "";
        }
        String longest = "";//String.valueOf(s.charAt(0));


        int offset = 0;
        for(int i = 0; i < s.length(); i++) {
            offset = 0;
            while((i >= offset) &&
                    (i + offset < s.length()) &&
                    (s.charAt(i-offset) == s.charAt(i+offset))


            ) {
                String substring = s.substring(i - offset, i + offset + 1);
                if (substring.length() >= longest.length()) {
                    longest = substring;
                }
                offset++;

            }
        }

        String longest2 = "";
        for(int left = 0, right = 1; right < s.length(); left++, right++) {
            offset = 0;
            while (
                    left - offset >= 0 &&
                    right + offset < s.length() &&
                    (s.charAt(left - offset) == s.charAt(right + offset))
                    
            ) {
                String substring = s.substring(left - offset, right + offset + 1);
                if (substring.length() >= longest2.length()) {
                    longest2 = substring;
                }
                offset++;
            }
        }

        return longest2.length() > longest.length() ? longest2 : longest;
    }

}
