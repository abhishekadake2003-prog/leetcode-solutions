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
    public TreeNode sortedArrayToBST(int[] nums) {
        return create(0,nums.length-1,nums);
    }
    public TreeNode create(int i,int j,int a[])
    {
        int mid=(i+j)/2;
        if(i>j)return null;
        TreeNode t1=new TreeNode();
        t1.left=create(i,mid-1,a);
        t1.right=create(mid+1,j,a);
        t1.val=a[mid];
        return t1;
    }
}