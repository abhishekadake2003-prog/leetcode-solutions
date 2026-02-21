class Solution {
    public int countPrimeSetBits(int left, int right) {
        // HashSet<Integer> set= new HashSet<>(new ArrayList<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17,19)));
        int ans=0;
        for(int i=left;i<=right;i++)
        {
            if(isPrime(Integer.bitCount(i)))ans++;
        }
        return ans;
    }
    boolean isPrime(int no)
    {
        if(no==1 || no==0)return false;
        for(int i=2;i<=no/2;i++)
        {
            if(no%i==0)return false;
        }
        return true;
    }
    // int calclulatebit(int n)
    // {
    //     int bit=0;
    //     while (n > 0) {
    //         if((n & 1)==1)bit++;
    //         n = n >> 1;
    //     }
    //     return bit;
    // }
}