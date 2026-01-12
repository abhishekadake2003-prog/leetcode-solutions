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
        ListNode node=head;
        int depth=0;
        while(node!=null)
        {
            depth++;
            node=node.next;
        }
        node=head;
        int ans=depth-n;
        if(ans==0)return head.next;
        while(node.next!=null && ans!=1)
        {
            node=node.next;
            ans--;
        }
        node.next=node.next.next;
        return head;
    }
}