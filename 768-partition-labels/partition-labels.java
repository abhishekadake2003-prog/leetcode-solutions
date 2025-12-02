class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> ls=new ArrayList();
        int n=s.length();
        int i=0,x=0;
        while(i<n)
        {
            Character c=s.charAt(i);
            int j=i,m=s.lastIndexOf(c);
            while(j<m)
            {
                if(s.charAt(j)!=c)
                {
                    m=Math.max(m,s.lastIndexOf(s.charAt(j)));
                }
                j++;
            }
            ls.add(j+1-x);
            x=j+1;
            i=j;
            i++;
        }
    return ls;}
}