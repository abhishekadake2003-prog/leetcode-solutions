class Solution {
    public int minSteps(String s, String t) {
        int arr1[]=new int[26];
        int arr2[]=new int[26];
        int n=s.length(),ans=0;
        for(int i=0;i<n;i++)
        {
            arr1[s.charAt(i)-97]++;
            arr2[t.charAt(i)-97]++;
        }
        for(int i=0;i<26;i++)
        {
            int a=arr1[i]-arr2[i];
            ans+=a>0?a:0;
        }
        return ans;
    }
}