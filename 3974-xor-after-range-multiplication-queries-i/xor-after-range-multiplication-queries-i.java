class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        long a =(long) Math.pow(10, 9) + 7;
        for(int i=0;i<queries.length;i++)
        {
            for(int j=queries[i][0];j<=queries[i][1];j+=queries[i][2])
            {
                long c=queries[i][3];
                nums[j]=(int)((c*nums[j])%a);
            }
        }
        int ans=0;
        for(int e:nums)
        {
            ans^=e;
        }
        return ans;
    }
}