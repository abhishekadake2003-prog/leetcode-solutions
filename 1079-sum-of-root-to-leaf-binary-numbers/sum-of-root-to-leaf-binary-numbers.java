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
    List<String> blist=new ArrayList<>();
    public int sumRootToLeaf(TreeNode root) {
        if(root==null)return 0;
        btree(root,"");
        int ans=0;
        for(int i=0;i<blist.size();i++)
        {
            ans+=Integer.parseInt(blist.get(i),2);
        }
        return ans;
    }
    void btree(TreeNode node, String a)
    {
        if(node.left==null && node.right==null)
        {
            blist.add(a+node.val);
            return;
        }
        a=a+node.val;
        if(node.left!=null)
        btree(node.left,a);
        if(node.right!=null)
        btree(node.right,a);
    }
}