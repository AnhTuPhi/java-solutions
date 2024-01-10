package vn.com.tech.solutions.leetcode.linkedlist;

/**
 * @author : AnhTuPhi
 * @created : 1/10/2024 - 11:09 PM - Wednesday
 * @project : java-solutions
 **/
public class AddTwoNumber {

    /**
     * You are given two non-empty linked lists representing two non-negative integers.
     * The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
     * <p>
     * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
     * <p>
     * Example 1:
     * Input: l1 = [2,4,3], l2 = [5,6,4]
     * Output: [7,0,8]
     * Explanation: 342 + 465 = 807.
     * <p>
     * Example 2:
     * Input: l1 = [0], l2 = [0]
     * Output: [0]
     * <p>
     * Example 3:
     * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
     * Output: [8,9,9,9,0,0,0,1]
     * <p>
     * Constraints:
     * The number of nodes in each linked list is in the range [1, 100].
     * 0 <= Node.val <= 9
     * It is guaranteed that the list represents a number that does not have leading zeros.
     */
    public static void main(String[] args) {
        System.out.println(11 / 5);
        System.out.println(11 % 5);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode tail = head;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int a = (l1 != null) ? l1.val : 0;
            int b = (l2 != null) ? l2.val : 0;
            int sum = a + b + carry;
            carry = sum / 10;
            tail.next = new ListNode(sum % 10);
            tail = tail.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return head.next;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
