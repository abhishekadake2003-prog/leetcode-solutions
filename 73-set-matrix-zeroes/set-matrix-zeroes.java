class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length,m=matrix[0].length;
        int r[]=new int[m];
        int c[]=new int[n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==0)
                {
                    r[j]=1;
                    c[i]=1;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            if(c[i]==1)
            {
                for(int j=0;j<m;j++)
                {
                    matrix[i][j]=0;
                }
            }
        }
        for(int i=0;i<m;i++)
        {
            if(r[i]==1)
            {
                for(int j=0;j<n;j++)
                {
                    matrix[j][i]=0;
                }
            }
        }
    }
}