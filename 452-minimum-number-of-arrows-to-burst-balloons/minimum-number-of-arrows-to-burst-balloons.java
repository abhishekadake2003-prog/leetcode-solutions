class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        // Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        int mark=points[0][1],ans=1;
        for(int i=0;i<points.length;i++)
        {
            if(mark<points[i][0] || mark>points[i][1])
            {
                ans++;
                mark=points[i][1];
            }
        }
        return ans;
    }
}