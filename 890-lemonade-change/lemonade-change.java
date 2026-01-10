class Solution {
    public boolean lemonadeChange(int[] bills) {
        int cash[]=new int[3];
        for(int i=0;i<bills.length;i++)
        {
            if(bills[i]==5)cash[0]++;
            else if(bills[i]==10)
            {
                if(cash[0]>0)
                {
                    cash[0]--;
                    cash[1]++;
                }
                else
                    return false;
            }
            else
            {
                if(cash[1]>0 && cash[0]>0)
                {
                    cash[0]--;
                    cash[1]--;
                    cash[2]++;
                }
                else if(cash[0]>2)
                {
                    cash[0]-=3;
                    cash[2]++;
                }
                else
                    return false;
            }
        }
    return true;}
}