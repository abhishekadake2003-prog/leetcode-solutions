class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<operations.length;i++)
        {
            if(operations[i].equals("+"))
            {
                int a=st.pop();
                int ans=a+st.peek();
                st.push(a);
                st.push(ans);
            }
            else if(operations[i].equals("D"))
            {
                st.push(st.peek()*2);
            }
            else if(operations[i].equals("C"))
            {
                st.pop();
            }
            else
                st.push(Integer.parseInt(operations[i]));
        }
        int answer=0;
        while(!st.isEmpty())
        {
            // System.out.println(st.peek());
            answer+=st.pop();
        }
        return answer;
    }
}