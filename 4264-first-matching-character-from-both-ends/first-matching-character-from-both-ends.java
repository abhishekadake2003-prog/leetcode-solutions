class Solution {
    public int firstMatchingIndex(String s) {
        if(s.length()==1)return 0;
        int i=0,j=s.length()-1,min=s.length()-1;;
        while(i<=j)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                min=Math.min(min,i);
            }
            i++;
            j--;
        }
        if(min==s.length()-1)return -1;
        return min;
    }
}