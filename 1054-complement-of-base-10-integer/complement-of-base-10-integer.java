class Solution {
    public int bitwiseComplement(int n) {
        if(n==0)return 1;
        StringBuilder sb=new StringBuilder();
      while(n!=0)
      {
        if((n&1)==1)
        sb.insert(0,'0');
        else
        sb.insert(0,'1');
        n>>>=1;
      }  
      return Integer.parseInt(sb.toString(),2);
    }

}