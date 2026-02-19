class Solution {
    public int countBinarySubstrings(String s) {
        List<Integer> list=new ArrayList<>();
        int count=1,ans=0;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)!=s.charAt(i-1))
            {
                list.add(count);
                count=1;
            }
            else
                count++;
        }
        list.add(count);
        for(int i=1;i<list.size();i++)
        {
            ans+=Math.min(list.get(i),list.get(i-1));
        }
        return ans;
    }
}