class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        //90
        int n=mat.length;
        boolean pass1=true,pass2=true,pass4=true,pass3=true;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(mat[i][j]!=target[j][n-i-1])
                    pass1=false;
                if(mat[i][j]!=target[i][j])
                pass2=false;
                if(mat[i][j]!=target[n-i-1][n-j-1])
                    pass3=false;
                if(mat[i][j]!=target[n-j-1][i])
                pass4=false;
            }

        }
        if(pass1 || pass2 || pass3 || pass4)
        return true;
        return false;
    }
}