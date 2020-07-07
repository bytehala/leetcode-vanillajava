package leetcode.numericpalindrome;

public class Solution {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else if (x == 0) {
            return true;
        }

        // modulo by 10 every time
        // remainingValue = divide by 10 every time
        // reversed = multiply by 10 every time

        int reversed = 0;
        int remainingValue = x;
        while (remainingValue != 0) {
            reversed *= 10;
            int ones = remainingValue % 10;
            reversed += ones;
            remainingValue /= 10;
        }

        //System.out.println("reversed = " + reversed);
        return reversed == x;
    }

    public static void main(String[] args) {
        System.out.format("%d %b\n", -121, new Solution().isPalindrome(-121));
        System.out.format("%d %b\n", 121, new Solution().isPalindrome(121));
        System.out.format("%d %b\n", 0, new Solution().isPalindrome(0));
        System.out.format("%d %b\n", 10, new Solution().isPalindrome(10));
    }

}
