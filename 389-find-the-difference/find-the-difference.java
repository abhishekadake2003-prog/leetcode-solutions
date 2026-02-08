class Solution {
    public char findTheDifference(String s, String t) {
        int ans=0;
        for(int i=0;i<t.length();i++)
        {
            ans+=(int)(t.charAt(i))-96;
        }
        for(int i=0;i<s.length();i++)
        {
            ans-=(int)(s.charAt(i))-96;
        }
        return (char)(ans+96);
    }
}