class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans=new ArrayList<>();
        if(nums.length<=0)return ans;
        int k=nums[0],j=nums[0];
        int i=0;
        for(i=1;i<nums.length;i++)
        {
            if(++k!=nums[i])
            {
                if(j==--k)
                ans.add(""+j);
                else
                ans.add(j+"->"+nums[i-1]);
                k=nums[i];
                j=nums[i];
            }
        }
        if(j==k)
        ans.add(""+j);
        else
        ans.add(j+"->"+nums[i-1]);
        return ans;
    }
}