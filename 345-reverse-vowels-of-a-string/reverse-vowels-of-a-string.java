class Solution {
    public String reverseVowels(String s) {
        // HashMap<Character> map=new HashMap<>(ArrayList.asList(["A","E","I","O","U","a","e","i","o","u"]));
        char arr[]=s.toCharArray();
        int i=0,j=s.length()-1;
        while(i<j)
        {
            if(isVowel(arr[i]) && isVowel(arr[j]))
            {
                char a=arr[i];
                arr[i]=arr[j];
                arr[j]=a;
                i++;
                j--;
            }
            else
            {
                if(!isVowel(arr[i]))
                i++;
                if(!isVowel(arr[j]))
                j--;
            }
        }
        return new String(arr);
    }
    boolean isVowel(char a)
    {
        return String.valueOf(a).matches("(?i)[aeiouAEIOU]"); 
    }
}