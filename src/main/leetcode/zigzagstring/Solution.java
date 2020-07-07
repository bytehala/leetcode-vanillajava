package leetcode.zigzagstring;

import java.util.ArrayList;
import java.util.List;

class Solution {

    static final int UP = -1;
    static final int DOWN = 1;

    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        List<StringBuilder> strings = initialize(numRows);
        int currentY = 0;
        int direction = DOWN;
        for(char c : s.toCharArray()) {
            strings.get(currentY).append(c);
            if(direction == DOWN && currentY + direction == numRows) {
                direction = UP;
            } else if (direction == UP && currentY + direction < 0) {
                direction = DOWN;
            }
            currentY += direction;
        }
//        System.out.println("string.get(0) = " + strings.get(0).toString());
        StringBuilder res = new StringBuilder();
        for(StringBuilder st : strings) {
            res.append(st.toString());
        }
        return res.toString();
    }

    private List<StringBuilder> initialize(int numRows) {
        List<StringBuilder> result = new ArrayList<>(numRows);
        for(int i = 0; i < numRows; i++) {
            result.add(new StringBuilder());
        }
        return result;
    }

    public static void main(String[] args) {
        String in = "AB";
        System.out.println(new Solution().convert(in, 1));
    }
}