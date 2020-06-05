package leetcode.sumtwo;

class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode head = result;

        boolean remainder = false;

        while(l1 != null || l2 != null) {
            int l1Val = 0;
            int l2Val = 0;
            if(l1 != null) {
                l1Val = l1.val;
                l1 = l1.next;
                if (l1 != null)
                    result.next = new ListNode(0);
            }
            if(l2 != null) {
                l2Val = l2.val;
                l2 = l2.next;
                if (l2 != null)
                    result.next = new ListNode(0);
            }

            int value = (l1Val + l2Val) + result.val;
            result.val = value % 10;
            if (value >= 10) {
                remainder = true;
                result.next = new ListNode(1);
            } else {
                remainder = false;
            }

            result = result.next;
        }

        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}