class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] a=new int[nums.size()];
        for(int i=0;i<nums.size();i++)
        {
            int k=nums.get(i);
            boolean pass=true;
            for(int j=1;j<k;j++)
            {
                if((int)(j|j+1)==k)
                {
                    a[i]=j;
                    pass=false;
                    break;
                }
            }
            if(pass)
                a[i]=-1;
        }
        return a;
    }
}