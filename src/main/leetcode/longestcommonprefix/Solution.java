package leetcode.longestcommonprefix;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        Arrays.sort(strs, Comparator.comparingInt(String::length));
        int index = 0;
        StringBuilder longestPrefix = new StringBuilder();
        while(index < strs[0].length()) {
            char currentChar = strs[0].charAt(index);
            int i;
            for (i = 1; i < strs.length; i++) {
                char comparedChar = strs[i].charAt(index);
                if (currentChar != comparedChar) {
                    break;
                }
            }
            if (i == strs.length) {
                longestPrefix.append(currentChar);
            } else {
                break;
            }
            index++;
        }
        return longestPrefix.toString();
    }

    public static void main(String[] args) {
//        String[] arr = new String[]{"flower","flow","flight"};
//        Arrays.sort(arr, Comparator.comparingInt(String::length));


        System.out.println(new Solution().longestCommonPrefix(new String[]{}));
    }
}