class Solution {
    public boolean isPowerOfTwo(int n) {
        if(Long.bitCount(n)==1)return true;
        else
            return false;
    }
}