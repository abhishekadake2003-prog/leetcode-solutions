class Solution {
    public String reverseWords(String s) {
        StringBuilder ans=new StringBuilder();
        boolean pass=false;
        int j=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                if(!pass)
                {
                    j=i;
                    pass=true;
                }
            }
            else{
                if(pass)
                {
                    ans.insert(0," "+s.substring(j,i));
                    pass=false;
                }
            }
        }
        if(pass)
        {
            ans.insert(0,s.substring(j,s.length()));
        }
        return ans.toString().trim();
    }
}