class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set=new HashSet<>();
        for(int x:candyType)
        {
            set.add(x);
        }
        int a=candyType.length/2;
        if(set.size()<a)
        {
            return set.size();
        }
        return a;
    }
}