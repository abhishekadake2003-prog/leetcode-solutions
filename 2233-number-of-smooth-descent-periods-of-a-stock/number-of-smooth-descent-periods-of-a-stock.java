class Solution {
    public long getDescentPeriods(int[] prices) {
        int n=prices.length;
        long a=n,j=0;
        for(int i=1;i<n;i++)
        {
            if(prices[i-1]-prices[i]==1)
            j++;
            else
                {
                    a+=(j*(j+1))/2;
                    j=0;
                }
        }
        a+=(j*(j+1))/2;
   return a; }
}