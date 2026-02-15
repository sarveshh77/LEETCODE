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
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        ListNode temp=head;
        int count =0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        if(count==1)
        {
            return null;
        }
        if(count==n)
        {
            return head.next;
        }
        ListNode temp2=head;
        int i=1;
        while(i<count-n)
        {
            temp2=temp2.next;
            i++;
        }
        if(temp2.next.next==null || temp2.next==null)
        {
            temp2.next=null;
            return head;
        }
        temp2.next=temp2.next.next;
        System.out.println(temp2.val);

    return head;
        
    }
}