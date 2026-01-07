class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())return false;
        Set<Character> s1=new HashSet<>();
        Set<Character> t2=new HashSet<>();
        Set<String> t1=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            s1.add(s.charAt(i));
            t2.add(t.charAt(i));
            t1.add(""+s.charAt(i)+t.charAt(i));
        }
        return s1.size()==t2.size() && s1.size()==t1.size();
    }
}