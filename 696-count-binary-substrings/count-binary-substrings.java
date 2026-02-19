class Solution {
    public int countBinarySubstrings(String s) {
        // List<Integer> list=new ArrayList<>();
        int count=1,ans=0,prev=0;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)!=s.charAt(i-1))
            {
                // list.add(count);
                ans+=Math.min(count,prev);
                prev=count;
                count=1;
            }
            else
                count++;
        }
        ans+=Math.min(count,prev);
        // list.add(count);
        // for(int i=1;i<list.size();i++)
        // {
        //     ans+=Math.min(list.get(i),list.get(i-1));
        // }
        return ans;
    }
}