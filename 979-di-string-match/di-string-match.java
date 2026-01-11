class Solution {
    public int[] diStringMatch(String s) {
        int n=s.length();
        int a[]=new int[n+1];
        int j=0,k=n;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='I')
                a[i]=j++;
            else
                a[i]=k--;
        }
        a[n]=j;
        return a;
    }
}