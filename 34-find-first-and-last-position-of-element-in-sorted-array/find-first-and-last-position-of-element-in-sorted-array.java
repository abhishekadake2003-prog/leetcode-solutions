class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==1)
        {
            if(nums[0]==target)
                return new int[]{0,0};
        }
        int low=0,high=nums.length-1;
        int ans[]={-1,-1};
        int mid=0;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(nums[mid]==target)
            {
                while(nums[low]!=target)low++;
                while(nums[high]!=target)high--;
                return new int[]{low,high};
            }
            else
            {
                if(nums[mid]<target)
                    low=mid+1;
                else
                    high=mid-1;
            }
        }
    return ans;
    }
}