class Solution {
    public boolean hasAlternatingBits(int n) {
        int oldbit = 2;
        while (n > 0) {
            int bit = n & 1;
            if (oldbit == 2)
                oldbit = bit;
            else if (oldbit == bit)
                return false;
            else
                oldbit = bit;
            n = n >> 1;
        }
        return true;
    }
}