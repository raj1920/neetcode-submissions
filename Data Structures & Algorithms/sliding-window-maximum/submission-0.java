class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
      int n = nums.length;
      int[] ans = new int[n-k+1];
      PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b[0], a[0]));
     int j=0;
      for(int i=0;i<n;i++){
        maxHeap.offer(new int[]{nums[i],i});
        if(i>=k-1){
            while(maxHeap.peek()[1]<=i-k){
                maxHeap.poll();
            }
            ans[j++]=maxHeap.peek()[0];
        }
            
         }
         return ans;
      }

}

