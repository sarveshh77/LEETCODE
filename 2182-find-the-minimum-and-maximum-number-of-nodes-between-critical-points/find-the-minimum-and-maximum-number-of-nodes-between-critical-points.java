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
    public int[] nodesBetweenCriticalPoints(ListNode head) 
    {
        ArrayList<Integer> al = new ArrayList<>();
         ListNode prev = head;
         ListNode curr = head.next;
         int index = 1;
         int min1=Integer.MAX_VALUE;
         int max1=Integer.MIN_VALUE;

         while(curr!=null && curr.next!=null)
         {
            if(curr.val>prev.val && curr.val>curr.next.val || curr.val<prev.val && curr.val<curr.next.val)
            {
                al.add(index);
            }
            prev=curr;
            curr=curr.next;
            index++;


         }
         if(al.size()<2)
         {
            return new int[] {-1,-1};
         }
         max1=al.get(al.size()-1) - al.get(0);
         for(int i=0;i<al.size()-1;i++)
         {
            int diff=al.get(i+1)-al.get(i);
            min1=Math.min(min1,diff);
         }
         
         return new int[] {min1,max1};
    }
}