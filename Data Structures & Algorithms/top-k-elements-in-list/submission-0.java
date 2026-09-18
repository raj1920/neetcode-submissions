class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int x: nums){
            mp.put(x,mp.getOrDefault(x,0)+1);
        }
        
        int[] ans = new int[k];

        for(int i=0;i<k;i++){
            int maxFreq = Collections.max(mp.values());
            for(int x : mp.keySet()){
                if(mp.get(x)==maxFreq){
                    ans[i]=x;
                    mp.remove(x);
                    break;
                }
            } 
        }
        return ans;
    }
}
