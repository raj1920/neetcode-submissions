class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> st = new HashSet<>();
        
        int l=0;
        
        int len=0;
        int n=s.length();
        for(int e=0;e<n;e++){
            while(st.contains(s.charAt(e))){
                st.remove(s.charAt(l));
                l++;
            } 
            st.add(s.charAt(e));
            len= Math.max(len,e-l+1);
        }
        return len;
    }
}
