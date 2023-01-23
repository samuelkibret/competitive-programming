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
     ListNode dummy = new ListNode(0);
     ListNode fast = head;
     ListNode slow = dummy;
     slow.next = fast;
    while(fast != null)
    {
        while(fast.next != null && fast.val == fast.next.val)//to find the last duplicate element
        {
            fast = fast.next;
        }
        if(slow.next != fast) // only if there are duplicates
        {
            slow.next = fast.next;  //slow is linked to the node next to the last duplicate
            fast = slow.next;  // fast is then moved a head of slow
        }
        else
        {
            slow = slow.next;
            fast = fast.next;
        }
    }
   return dummy.next;
}
}
