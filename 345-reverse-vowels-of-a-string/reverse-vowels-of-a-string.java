class Solution {
    public String reverseVowels(String s) {
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
    boolean isVowel(char c)
    {
        // return String.valueOf(a).matches("(?i)[aeiouAEIOU]"); 
        // HashSet<Character> Set=new HashSet<>(ArrayList.asList(["A","E","I","O","U","a","e","i","o","u"]));
        // return Set.contains(a)
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' 
            || c == 'o' || c == 'u';

    }
}