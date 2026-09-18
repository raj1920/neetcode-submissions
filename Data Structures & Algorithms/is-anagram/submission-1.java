class Solution {
    public boolean isAnagram(String s, String t) {
    //    char[] s1 = s.toArray();
    //    Collections.sort(s1);
    //    char[] s2 = t.toArray();
    //    Collections.sort(s2);
    //    if(s1.toString()== s2.toString){
    //     return true;
    //    }
    //    return false;
        if(s.length()!=t.length()) return false;
    Map<Character,Integer> mp = new HashMap();
    for(char ch : s.toCharArray()){
          mp.put(ch,mp.getOrDefault(ch,0)+1);
    }
    for(char ch : t.toCharArray()){
          if(!mp.containsKey(ch)|| mp.get(ch)==0){
            return false;
          }else{
            mp.put(ch,mp.getOrDefault(ch,0)-1);
          }
        }
        return true;
    
}
}