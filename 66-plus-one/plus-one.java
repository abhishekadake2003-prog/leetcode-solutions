class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length-1;
        boolean pass=false;
        while(n>=0)
        {
            if(digits[n]!=9)
            {
                digits[n]++;
                return digits;
            }
            else
            {
                digits[n]=0;
            }
            n--;
        }
        int a[]=new int[digits.length+1];
        a[0]=1;
        return a; 
    }
}