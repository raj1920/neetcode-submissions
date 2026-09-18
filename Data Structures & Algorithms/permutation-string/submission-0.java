class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> st = new HashMap<>();
        
        if(s1.length()>s2.length()) return false;
        for( char c : s1.toCharArray()){
            st.put(c,st.getOrDefault(c,0)+1);
        }
        for(int i=0;i<s2.length()-s1.length()+1;i++){
          HashMap<Character,Integer> st1= new HashMap<>();
          //if(st1.isEmpty()) System.out.println("Set has no elements"+st1.size());
            for(int j=i;j<i+s1.length();j++){
               st1.put(s2.charAt(j),st1.getOrDefault(s2.charAt(j),0)+1);
            }
            if(st1.equals(st)) return true;
        }

        return false;
         
    }
}
