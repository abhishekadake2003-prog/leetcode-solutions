class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int j=n/2,k=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(nums[i]<0)
            a[j++]=nums[i];
            else
            a[k++]=nums[i];
        }
        j=n/2;
        k=0;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            nums[i]=a[k++];
            else
            nums[i]=a[j++];
        }
    return nums;}
}