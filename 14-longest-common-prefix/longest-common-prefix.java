class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String x=strs[strs.length-1],ans="";
        for(int i=0;i<Math.min(strs[0].length(),x.length());i++)
        {
            if(x.charAt(i)!=strs[0].charAt(i))
                return ans;
            else
                ans+=x.charAt(i);
        }
        return ans;
    }
}