class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        char arr[]=encodedText.toCharArray();
        StringBuilder ans=new StringBuilder();
        int col=arr.length/rows;
        for(int i=0;i<col;i++)
        {
            for(int j=0;j<rows;j++)
            {
                int a=(j*col)+i+j;
                if(a<arr.length)
                ans.append(arr[a]);
                else
                    break;
            }
        }
        return ans.toString().stripTrailing();
    }
}