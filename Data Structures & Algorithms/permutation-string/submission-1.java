class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> st = new HashMap<>();
        
        if(s1.length()>s2.length()) return false;
        for( char c : s1.toCharArray()){
            st.put(c,st.getOrDefault(c,0)+1);
        }
        HashMap<Character,Integer> st1= new HashMap<>();
        int l=0;
        int r=s1.length();
        for(int i=0;i<r;i++){
            st1.put(s2.charAt(i),st1.getOrDefault(s2.charAt(i),0)+1);
        }
        if(st1.equals(st)) return true;
            while(r<s2.length()){
                //st1.put(s2.charAt(l),st1.getOrDefault(s2.charAt(l),0)-1);
                 // Decrement outgoing character and remove if zero
            char leftChar = s2.charAt(l);
            if (st1.get(leftChar) == 1) {
                st1.remove(leftChar);
            } else {
                st1.put(leftChar, st1.get(leftChar) - 1);
            }
                st1.put(s2.charAt(r),st1.getOrDefault(s2.charAt(r),0)+1);
                 l++;
                r++;
                if(st1.equals(st)) return true;
            }

        return false;
         
    }
}
