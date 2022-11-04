/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode sentinel = new ListNode(0, head);
        ListNode pred = sentinel;

        while (head != null) {
            if (head.next != null && head.val == head.next.val) {
                pred.next = head.next;
            } else {
                pred = pred.next;
            }
            head = head.next;
        }
        return sentinel.next;
    }
}