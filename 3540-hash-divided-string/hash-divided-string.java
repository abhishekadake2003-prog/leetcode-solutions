class Solution {
    public String stringHash(String s, int k) {
        int n=s.length();
        String ans="";
        int j=0;
        int chars=0;
        for(int i=0;i<n;i++)
        {
            if(j>=k)
            {
                chars%=26;
                ans=ans+(char)(chars+97);
                chars=0;
                j=0;
            }
            chars+=(s.charAt(i)-97);
            j++;
            // System.out.println(chars);
        }
        chars%=26;
        ans=ans+(char)(chars+97);
        return ans;
    }
}