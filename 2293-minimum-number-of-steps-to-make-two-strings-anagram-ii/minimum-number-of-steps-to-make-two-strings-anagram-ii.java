class Solution {
    public int minSteps(String s, String t) {
        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            int val = ch - 'a';
            freq[val]++;
        }

        for(char ch : t.toCharArray()){
            int val = ch - 'a';
            freq[val]--;
        }

        int res = 0;
        for(int val : freq){
            res += (val > 0) ? val : (val < 0) ? -val : 0;
        }

        return res;
    }
}