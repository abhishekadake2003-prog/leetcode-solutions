class Solution {
    public int countPartitions(int[] nums) {
        int n=nums.length,sum=0,left=0,ans=0;
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
        }
        for(int i=0;i<n-1;i++)
        {
            left+=nums[i];
            sum-=nums[i];
            if((sum-left)%2==0)ans++;
        }
    return ans;}
}