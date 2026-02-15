class Solution {
    public String addBinary(String a, String b) {
        int n1=a.length()-1,n2=b.length()-1;
        StringBuilder ans=new StringBuilder();
        char bit='0';
        while(n1>=0&&n2>=0)
        {
            int count=0;
            if(a.charAt(n1)=='1')count++;
            if(b.charAt(n2)=='1')count++;
            if(bit=='1')count++;
            if(count==3)
            {
                ans.insert(0,"1");
                bit='1';
            }
            else if(count ==2)
            {
                ans.insert(0,"0");
                bit='1';
            }
            else if(count ==1)
            {
                ans.insert(0,"1");
                bit='0';
            }
            else
            {
                ans.insert(0,"0");
                bit='0';
            }
            n1--;
            n2--;
        }
        while(n1>=0)
        {
            int count=0;
            if(a.charAt(n1)=='1')count++;
            if(bit=='1')count++;
            if(count ==2)
            {
                ans.insert(0,"0");
                bit='1';
            }
            else if(count ==1)
            {
                ans.insert(0,"1");
                bit='0';
            }
            else
            {
                ans.insert(0,"0");
                bit='0';
            }
            n1--;
        }
        while(n2>=0)
        {
            int count=0;
            if(b.charAt(n2)=='1')count++;
            if(bit=='1')count++;
            if(count==2)
            {
                ans.insert(0,"0");
                bit='1';
            }
            else if(count ==1)
            {
                ans.insert(0,"1");
                bit='0';
            }
            else
            {
                ans.insert(0,"0");
                bit='0';
            }
            n2--;
        }
        if(bit=='1')ans.insert(0,'1');
        return ans.toString();
    }
}