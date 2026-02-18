class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int good=0;
        for(int num:nums)
        {
            if(map.get(num)!=null)good+=map.get(num);
            map.put(num,map.getOrDefault(num,0)+1);
            
        }
        // for(int num:nums)
        // {
        //     good+=map.get(num)-1;
        //     map.put(num,map.getOrDefault(num,0)-1);
        // }
        return good;
    }
}