class Solution {
    public boolean hasDuplicate(int[] nums) {
       // Hashmap<Integer,Integer> mp = new Hashmap<>();
        Arrays.sort(nums);
        for(int i =1;i<nums.length;i++){
           if(nums[i]==nums[i-1]){
            return true;
           }
        }
        return false;
    }
}