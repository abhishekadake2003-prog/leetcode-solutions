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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)return null;
        while(head!=null && head.val==val)
        head=head.next;
        ListNode node=head,n1=head;
        while(node!=null)
        {
            if(node.val==val)
            {
                n1.next=node.next;
            }
            else
            n1=node;
            node=node.next;
        }
        return head;
    }
}