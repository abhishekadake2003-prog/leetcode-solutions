class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<t.length();i++)
        {
            char a=t.charAt(i);
            map.put(a,map.getOrDefault(a,0)+1);
        }
        for(int i=0;i<s.length();i++)
        {
            char a=s.charAt(i);
            map.put(a,map.getOrDefault(a,0)-1);
        }
        for (Map.Entry<Character, Integer> e : map.entrySet()) { 
            if(e.getValue()==1)
            {
                return e.getKey();
            }
        }
        return t.charAt(0);
    }
}