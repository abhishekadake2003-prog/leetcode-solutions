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
    public ListNode oddEvenList(ListNode head) {
        ListNode odd=new ListNode();
        ListNode Even=new ListNode();
        ListNode node=head,t1=odd,t2=Even;
        int i=1;
        while(node!=null)
        {
            if(i%2==0)
            {
                Even.next=node;
                Even=Even.next;
            }
            else
            {
                odd.next=node;
                odd=odd.next;
            }
            node=node.next;
            i++;
        }
        Even.next=null;
        odd.next=t2.next;
        return t1.next;
    }
}