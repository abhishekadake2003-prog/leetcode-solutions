class Solution {
    public int countOdds(int low, int high) {
        // int a=0;
        // for(int i=low;i<=high;i++)
        // {
        //     if(i%2!=0)a++;
        // }
        int a=low%2,b=high%2;
        if(a==0 && b==0)return(high-low)/2;
        return ((high-low)/2)+1;
    }
}