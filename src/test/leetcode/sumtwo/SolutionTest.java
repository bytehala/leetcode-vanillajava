package leetcode.sumtwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    static ListNode createListNodeNum(int[] nums) {
        ListNode s = new ListNode(nums[0]);
        ListNode prev = s;
        for(int i = 0; i < nums.length; i++) {
            if(i > 0) {
                ListNode temp = new ListNode(nums[i]);
                prev.next = temp;
                prev = temp;
            }
        }
        return s;
    }

    static String getListNodeStr(ListNode a) {
        StringBuilder result = new StringBuilder();
        do {
            result.append(a.val);
            result.append(" -> ");
            a = a.next;
        } while(a != null);
        return result.toString();
    }

    @Test
    void addTwoNumbers() {

        Solution s = new Solution();
        ListNode a = createListNodeNum(new int[]{2, 4, 3});
        ListNode b = createListNodeNum(new int[]{5, 6, 4});

        System.out.println(getListNodeStr(a));
        System.out.println(getListNodeStr(b));

        assertEquals(getListNodeStr(createListNodeNum(new int[]{7, 0, 8})), getListNodeStr(s.addTwoNumbers(a, b)));

    }

    @Test
    void addOneDigit() {

        Solution s = new Solution();
        ListNode a = createListNodeNum(new int[]{1});
        ListNode b = createListNodeNum(new int[]{2});

        System.out.println(getListNodeStr(a));
        System.out.println(getListNodeStr(b));

        assertEquals(getListNodeStr(createListNodeNum(new int[]{3})), getListNodeStr(s.addTwoNumbers(a, b)));

    }

    @Test
    void addWithRemainder() {

        Solution s = new Solution();
        ListNode a = createListNodeNum(new int[]{8});
        ListNode b = createListNodeNum(new int[]{2});

        System.out.println(getListNodeStr(a));
        System.out.println(getListNodeStr(b));

        assertEquals(getListNodeStr(createListNodeNum(new int[]{0, 1})), getListNodeStr(s.addTwoNumbers(a, b)));

    }

    @Test
    void addTwoDigits() {

        Solution s = new Solution();
        ListNode a = createListNodeNum(new int[]{1, 0});
        ListNode b = createListNodeNum(new int[]{8, 3});

        System.out.println(getListNodeStr(a));
        System.out.println(getListNodeStr(b));

        assertEquals(getListNodeStr(createListNodeNum(new int[]{9, 3})), getListNodeStr(s.addTwoNumbers(a, b)));

    }

    @Test
    void addToHOneHundred() {

        Solution s = new Solution();
        ListNode a = createListNodeNum(new int[]{1});
        ListNode b = createListNodeNum(new int[]{9, 9});

        System.out.println(getListNodeStr(a));
        System.out.println(getListNodeStr(b));

        assertEquals(getListNodeStr(createListNodeNum(new int[]{0, 0, 1})), getListNodeStr(s.addTwoNumbers(a, b)));

    }
}