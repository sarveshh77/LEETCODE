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
    public void reorderList(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode secHalf=slow.next;
        slow.next=null;

        ListNode prev=null;
        ListNode curr=secHalf;
        ListNode next;

        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ListNode firstOne=head;
        ListNode secOne=prev;

        while(secOne!=null)
        {
            ListNode t1=firstOne.next;
            ListNode t2=secOne.next;

            firstOne.next=secOne;
            secOne.next=t1;

            firstOne=t1;
            secOne=t2;
        }
    }
}