class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int ans=0,cap=capacity;
        for(int i=0;i<plants.length;i++)
        {
            if(plants[i]<=cap)
            {
                ans++;
                cap-=plants[i];
            }
            else
            {
                cap=capacity;
                ans+=(i*2)+1;
                cap-=plants[i];
            }
            // System.out.println(ans);
        }
        return ans;
    }
}