class Solution {
    public boolean isTrionic(int[] nums) {
        if (nums.length < 4) return false;

        boolean pass = true;   // increasing
        boolean pass2 = true;  // haven't entered final increasing yet

        boolean inc1 = false, dec = false, inc2 = false;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) return false;

            if (pass) { // increasing
                if (nums[i] > nums[i - 1]) {
                    if (pass2) inc1 = true;
                    else inc2 = true;
                } else { // switch to decreasing
                    if (!pass2) return false;
                    pass = false;
                    dec = true;
                }
            } else { // decreasing
                if (nums[i] < nums[i - 1]) {
                    dec = true;
                } else { // switch to final increasing
                    pass = true;
                    pass2 = false;
                    inc2 = true;
                }
            }
        }

        return inc1 && dec && inc2;
    }
}
