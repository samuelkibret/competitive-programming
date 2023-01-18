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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null)
        {
            return list2;
        }
        if(list2 == null)
        {
            return list1;
        }
        ListNode head;
        
        if(list1.val < list2.val)
            {
                head = list1;
                list1 = list1.next;
            }
        else
        {
            head = list2;
            list2 = list2.next;
        }
        ListNode h2 = head;
        while(list1 != null  && list2 != null)
        {
            if(list1.val < list2.val)
            {
                h2.next = list1;
                h2 = h2.next;
                list1 = list1.next;
            }
            else
            {
                h2.next = list2;
                h2 = h2.next;
                list2 = list2.next;
            }
        }
        
            while(list2 != null)
            {
                h2.next = list2;
                h2 = h2.next;
                list2 = list2.next;
            }
        
            while(list1 != null)
            {
                 h2.next = list1;
                h2 = h2.next;
                list1 = list1.next;
            }
    
        return head;
    }
}
