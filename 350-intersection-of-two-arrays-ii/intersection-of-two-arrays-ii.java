class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int j=0;
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums1.length;)
        {
            if(j>=nums2.length)break;
            if(nums1[i]==nums2[j])
            {
                ans.add(nums1[i++]);
                j++;
            }
            else
            {
                if(nums1[i]<nums2[j])
                    i++;
                else
                    j++;
            }
        }
        int i=0;
        int a[]=new int[ans.size()];
        for(int x:ans)
        {
            a[i++]=x;
        }
        return a;
    }
}