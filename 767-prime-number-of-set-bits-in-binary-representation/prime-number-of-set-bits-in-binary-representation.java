class Solution {
    public int countPrimeSetBits(int left, int right) {
        HashSet<Integer> set= new HashSet<>(new ArrayList<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17,19)));
        int ans=0;
        for(int i=left;i<=right;i++)
        {
            int bit=calclulatebit(i);
            if(set.contains(bit))ans++;
        }
        return ans;
    }
    int calclulatebit(int n)
    {
        int bit=0;
        while (n > 0) {
            if((n & 1)==1)bit++;
            n = n >> 1;
        }
        return bit;
    }
}