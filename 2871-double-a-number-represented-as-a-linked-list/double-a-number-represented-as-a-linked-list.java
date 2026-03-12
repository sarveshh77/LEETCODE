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
    public ListNode doubleIt(ListNode head) 
    {
        ArrayList<Integer> arr= new ArrayList<>();

        while(head!=null)
        {
            arr.add(head.val);
            head=head.next;
        }
        int carry=0;
        for(int i=arr.size()-1;i>=0;i--)
        {
            int sum=arr.get(i)*2+carry;
            arr.set(i,sum%10);
            carry=sum/10;
        }
        ListNode dummy = new ListNode(0);
        ListNode curr=dummy;
        if(carry>0)
        {
             curr.next = new ListNode(carry);
             curr = curr.next;
        }
        for( int num : arr)
        {
            curr.next = new ListNode(num);
            curr=curr.next;
        }
        return dummy.next;
    }
    
}