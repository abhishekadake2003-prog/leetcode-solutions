class Solution {
    public int countTriples(int n) {
        int ans=0;
      for(int i=1;i<=n;i++)
      {
        for(int j=i+1;j<=n;j++)
        {
            double d=Math.sqrt(Math.pow(i,2)+Math.pow(j,2));
            if(d==Math.floor(d)&& d<=n)
                ans+=2;
        }
      }  
    // return 0;
    return ans;}
}