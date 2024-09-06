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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        for (int num: nums) {
            set.add(num);
        }
        
        ListNode dummy = new ListNode(0);
        ListNode res = dummy;
        ListNode temp = head;

        while (temp != null) {
            if (!set.contains(temp.val)) {
                res.next = new ListNode(temp.val);
                res = res.next;
            }

            temp = temp.next;
        }

        return dummy.next;
    }
}