class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int ans=0;
        boolean pass=true;
       for(int i=0;i<words.length;i++)
       {
            pass=true;
            for(int j=0;j<words[i].length();j++)
            {
                if(allowed.indexOf(words[i].charAt(j))==-1)
                {
                    pass=false;
                    break;
                }
            }
            if(pass)ans++;
       } 
       return ans;
    }
}