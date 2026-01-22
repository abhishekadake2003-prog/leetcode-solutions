class Solution {
    public int minimumPairRemoval(int[] nums) {
        List<Long> arr = new ArrayList<>();
        for (int x : nums) arr.add((long) x);

        int ops = 0;

        while (!isNonDecreasing(arr)) {
            int idx = 0;
            long minSum = Long.MAX_VALUE;

            // find leftmost minimum-sum adjacent pair
            for (int i = 0; i < arr.size() - 1; i++) {
                long sum = arr.get(i) + arr.get(i + 1);
                if (sum < minSum) {
                    minSum = sum;
                    idx = i;
                }
            }

            // merge
            arr.set(idx, arr.get(idx) + arr.get(idx + 1));
            arr.remove(idx + 1);
            ops++;
        }
        return ops;
    }

    private boolean isNonDecreasing(List<Long> arr) {
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < arr.get(i - 1)) return false;
        }
        return true;
    }
}
