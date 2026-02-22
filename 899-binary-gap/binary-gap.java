class Solution {
    public int binaryGap(int n) {
        int ans = 0, max = 0;
        boolean seen = false;
        while (n > 0) {
            int bit = n & 1;
            if (bit == 1) {
                if (seen) {
                    max = Math.max(max, ans);
                } else
                    seen = true;
                    ans = 1;
            } else
                ans++;
            n = n >> 1;
        }
        return max;
    }
}