class Solution {
    public int minOperations(String s) {
        int count1=0,count2=0;
        boolean pass=false;
        for(char c:s.toCharArray())
        {
            if(pass)
            {
                if(c=='0')count1++;
                pass=false;
            }
            else
            {
                if(c=='1')count1++;
                pass=true;
            }
        }
        pass=false;
        for(char c:s.toCharArray())
        {
            if(pass)
            {
                if(c=='1')count2++;
                pass=false;
            }
            else
            {
                if(c=='0')count2++;
                pass=true;
            }
        }
        return Math.min(count1,count2);
    }
}