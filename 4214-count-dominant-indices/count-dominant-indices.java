class Solution {
    public int dominantIndices(int[] nums) {
        int n=nums.length,ans=0;
        int avg=nums[n-1];
        long sum=avg;
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i]>avg)ans++;
            sum+=nums[i];
            avg=(int)sum/(n-i);
            // System.out.println(avg+""+(n-i));
        }
        return ans;
    }
}