/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int no=0;
    public int sumNumbers(TreeNode root) {
        find(root,0);
        return no;
    }
    void find(TreeNode node,long a)
    {
        if(node==null)return;
        a=(a*10)+node.val;
        if(node.left==null && node.right==null)
        {
            no+=(int)a;
        }
        if(node.left!=null)find(node.left,a);
        if(node.right!=null)find(node.right,a);
    }
}