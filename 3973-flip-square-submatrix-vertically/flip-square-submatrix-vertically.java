class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        for(int i=y;i<y+k;i++)
        {
            int z=k+x-1,c=x;
            while(c<z)
            {
                int temp=grid[c][i];
                grid[c][i]=grid[z][i];
                grid[z][i]=temp;
                c++;
                z--;
            }
        }
        return grid;
    }
}