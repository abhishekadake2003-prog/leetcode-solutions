class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int prefix=1;
        long suffix=1;
        int n=grid.length,m=grid[0].length;
        int ans[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                ans[i][j]=prefix;
                long a=(long)prefix*grid[i][j];
                a%=12345;
                prefix=(int)a;
            }
        }
        for(int i=n-1;i>-1;i--)
        {
            for(int j=m-1;j>-1;j--)
            {

                long a=(long)ans[i][j]*suffix;
                a%=12345;
                ans[i][j]=(int)a;
                suffix*=grid[i][j];
                suffix%=12345;
            }
        }
        return ans;
    }
}