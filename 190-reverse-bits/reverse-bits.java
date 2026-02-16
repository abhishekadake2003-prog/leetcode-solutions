class Solution {
    public int reverseBits(int n) {
        String s=Integer.toBinaryString(n);
        while (s.length() < 32) {
            s = "0" + s;
        }
        StringBuilder ans=new StringBuilder(s);
        ans.reverse();
        return Integer.parseUnsignedInt(ans.toString(), 2);
    }
}