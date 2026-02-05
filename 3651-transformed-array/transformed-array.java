class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(nums[i]<0)
            {
                int j=Math.abs(nums[i]);
                int k=i;
                while(j!=0)
                {
                    j--;
                    k--;
                    if(k<0)k=n-1;
                }
                ans[i]=nums[k];
                // System.out.println(k);

            }
            else if(nums[i]>0)
            {
                int j=Math.abs(nums[i]);
                int k=i;
                while(j!=0)
                {
                    j--;
                    k++;
                    if(k==n)k=0;
                }
                ans[i]=nums[k];
                // System.out.println(k);
            }
            else
                ans[i]=nums[i];
        }
        return ans;
    }
}