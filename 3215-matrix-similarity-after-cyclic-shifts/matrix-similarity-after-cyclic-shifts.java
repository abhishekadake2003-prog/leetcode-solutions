class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int n=mat.length,m=mat[0].length;
        int count=k%m;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i%2!=0)
                {
                    if(mat[i][j]!=mat[i][(j+count)%m])return false;
                }
                else
                {
                    if(mat[i][j]!=mat[i][(j-count+m)%m])return false;
                }
            }
        }
        return true;
    }
}