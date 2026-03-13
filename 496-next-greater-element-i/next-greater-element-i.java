class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for(int i=0;i<nums1.length;i++)
        {
            boolean pass=false,q=true;
            for(int j=0;j<nums2.length;j++)
            {
                if(pass)
                {
                    if(nums2[j]>nums1[i])
                    {
                        nums1[i]=nums2[j];
                        q=false;
                        break;
                    }
                }
                if(nums1[i]==nums2[j])
                {
                    pass=true;
                }
            }
            if(q)
            nums1[i]=-1;
        }
        return nums1;
    }
}