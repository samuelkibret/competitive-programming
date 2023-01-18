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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       
        ListNode start = head;
        ListNode remove = head;
        ListNode last = head;
        int count = 0;
        while(last != null)
        {
            count++;
            last = last.next;
            
        }
        if(n == count)
        {
            return head.next;
        }
        for(int i= 0 ; i < count - n - 1 ; i++ )
        {
            start = start.next;
        }
        for(int i = 0 ; i < count - n ; i++)
        {
            remove = remove.next;
        }
       
        start.next = remove.next;
        return head;

    }
}
