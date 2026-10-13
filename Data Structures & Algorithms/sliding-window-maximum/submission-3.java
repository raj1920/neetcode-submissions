class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
      int n = nums.length;
      int[] ans = new int[n-k+1];
      Deque<Integer> dq = new ArrayDeque<>();

      int l=0;
      int r=0;
      int id=0;
      while(r<n){

        // remove the smaller element to maintain the monotonic behaviour 
        while(!dq.isEmpty() && nums[dq.peekLast()]<nums[r]){
            dq.removeLast();
        }
            dq.offerLast(r);
        
        // remove out of window element 
        if(l>dq.peekFirst()){
            dq.removeFirst();
        }

        if(r-l+1==k){
          ans[id++]=nums[dq.peekFirst()];
          l++;
        }
        r++;
      }
         return ans;
      }

}

