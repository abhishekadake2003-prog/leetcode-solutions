class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            int subarr=0;
            for(int j=i;j<nums.length;j++)
            {
                subarr+=nums[j];
                if(subarr==k)count++;
            }
        }
        return count;
    }
}