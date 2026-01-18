class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] ch=new int[26];
        for(int i=0;i<magazine.length();i++)
        {
            ch[magazine.charAt(i)-97]++;
        }
        for(int i=0;i<ransomNote.length();i++)
        {
            ch[ransomNote.charAt(i)-97]--;
            if(ch[ransomNote.charAt(i)-97]<0)
            return false;
        }
        return true;
    }
}