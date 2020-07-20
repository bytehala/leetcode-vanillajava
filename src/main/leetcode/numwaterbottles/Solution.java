package leetcode.numwaterbottles;

public class Solution {

    public int numWaterBottles(int numBottles, int numExchange) {
        int numFull = numBottles;
        int numEmpty = 0;
        int remainderBottles = 0;
        int totalBottles = numFull;

       while (numFull >= numExchange) {
           remainderBottles = numFull % numExchange;
           numFull /= numExchange;
           totalBottles += numFull;
           numFull += remainderBottles;
       }

        return totalBottles;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().numWaterBottles(15, 4));
    }

}
