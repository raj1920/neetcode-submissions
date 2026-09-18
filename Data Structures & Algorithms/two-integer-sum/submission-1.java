class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp = new HashMap<>();
          //Map<String,String> map = new HashMap<>();
       for(int i=0;i<nums.length;i++){
            Integer next = target-nums[i];
            if(mp.containsKey(next)){
                return new int[]{mp.get(next),i};
            }else{
                mp.put(nums[i],i);
            }
       }  
       return new int[]{};
    }
}
