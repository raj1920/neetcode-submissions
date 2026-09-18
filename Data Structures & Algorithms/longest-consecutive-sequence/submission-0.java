class Solution {
    public int longestConsecutive(int[] nums) {
      Set<Integer> st = new HashSet<>();

      for(int x : nums){
        st.add(x);
      }
      
      int res=0;
      int curr=0;
      for(int x : st){
        
        int streak=0; curr=x;
        if(!st.contains(curr-1)){    
        while(st.contains(curr)){
            curr++;
            streak++;
        }
       res = Math.max(streak,res);
        }
      }

      return res;
         
        
    }
}
