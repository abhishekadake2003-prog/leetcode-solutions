class Solution {
    public int longestPalindrome(String s) {
        int ans=0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character a=s.charAt(i);
            map.put(a,map.getOrDefault(a,0)+1);
        }
        boolean pass=true;
        for(int e:map.values())
        {
            if(e%2==0)
                ans+=e;
            else
            {
                if(pass)
                {
                    ans++;
                    pass=false;
                }
                ans+=e-1;
            }
        }
    return ans;}
}