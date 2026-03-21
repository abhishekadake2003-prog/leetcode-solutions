class Solution {
    public int partitionString(String s) {
        HashSet<Character> set=new HashSet<>();
        int ans=0;
        for(char c:s.toCharArray())
        {
            if(set.contains(c))
            {
                set.clear();
                ans++;
            }
            set.add(c);
        }
        return ans+1;
    }
}