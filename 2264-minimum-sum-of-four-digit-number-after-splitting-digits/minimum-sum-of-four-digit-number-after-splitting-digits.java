class Solution {
    public int minimumSum(int num) {
        int min1 = 9, min2 = 9;
        int sum = 0;

        // find two smallest digits
        while (num > 0) {
            int d = num % 10;

            if (d < min1) {
                min2 = min1;
                min1 = d;
            } else if (d < min2) {
                min2 = d;
            }
            sum += d;
            num /= 10;
        }

        // sum of ones digits = total sum - (tens digits)
        return (min1 * 10 + min2 * 10) + (sum - min1 - min2);
    }
}
