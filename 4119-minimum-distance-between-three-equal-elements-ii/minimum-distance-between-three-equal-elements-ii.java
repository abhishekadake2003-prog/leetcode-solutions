class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
            {
                map.computeIfAbsent(nums[i], x -> new ArrayList<>()).add(i);
            }
        int minDist = Integer.MAX_VALUE;
        boolean found = false;
        for (List<Integer> indices : map.values()) {
            if (indices.size() >= 3) {
                for (int i = 0; i + 2 < indices.size(); i++) {
                    int dist = 2 * (indices.get(i + 2) - indices.get(i));
                    minDist = Math.min(minDist, dist);
                    found = true;
                }
            }
        }

        return found ? minDist : -1;
    }
}