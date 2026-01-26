class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=1;i<arr.length;i++)
        {
            min=Math.min(min,Math.abs(arr[i]-arr[i-1]));
        }
        for(int i=1;i<arr.length;i++)
        {
            if(Math.abs(arr[i]-arr[i-1])==min)
            {
                List<Integer> a=new ArrayList<>();
                a.add(arr[i-1]);
                a.add(arr[i]);
                ans.add(a);
            }
        }
        return ans;
    }
}