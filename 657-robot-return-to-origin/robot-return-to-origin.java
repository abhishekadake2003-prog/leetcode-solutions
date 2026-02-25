class Solution {
    public boolean judgeCircle(String moves) {
        int d=0,s=0;
        for(int i=0;i<moves.length();i++)
        {
            char a=moves.charAt(i);
            if(a=='U')
                d++;
            else if(a=='D')
            d--;
            else if(a=='L')
            s++;
            else
            s--;
        }
        if(d==0 && s==0)return true;
        return false;
    }
}