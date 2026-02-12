class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int max=0,freq=-1;
        for (Map.Entry<Integer,Integer> e : map.entrySet())
        {
            if(e.getKey()%2==0 && max<e.getValue())
            {
                max=e.getValue();
                freq=e.getKey();
            }
            else if(e.getKey()%2==0 && max==e.getValue())
            {
                if(e.getKey()<freq)
                {
                    max=e.getValue();
                    freq=e.getKey();
                }
            }
        }
        return freq;
    }
}