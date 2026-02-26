class Solution {
    public int numSteps(String s) {
        int pointer=s.length()-1;
        int steps=0;
        int carry=0;
        while(pointer>0)
        {
            steps++;
           if(s.charAt(pointer)-'0'+carry==1)
           {
                steps++;
                carry=1;
           }
           pointer--;
        }
        return steps+carry;
    }
}