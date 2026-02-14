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
    int target=0;
    boolean ans=false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)return false;
        target=targetSum;
        find(root,0);
        return ans;
    }
    void find(TreeNode node,int a)
    {
        if(node==null)return;
        a+=node.val;
        if(node.left==null && node.right==null)
        {
            if(a==target)ans=true;
        }
        
        if(node.left!=null)find(node.left,a);
        if(node.right!=null)find(node.right,a);
        a-=node.val;
    }
}