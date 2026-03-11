class Solution {
    public int findComplement(int num) {
        if(num==0)return 1;
        StringBuilder sb=new StringBuilder();
      while(num!=0)
      {
        if((num&1)==1)
        sb.insert(0,'0');
        else
        sb.insert(0,'1');
        num>>>=1;
      }  
      return Integer.parseInt(sb.toString(),2); 
    }
}