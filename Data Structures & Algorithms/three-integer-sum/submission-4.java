class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> st = new HashSet<>();
        int n = nums.length;
        int target =0;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;

            int j = i+1; int k =n-1;
            while(j<k){
            int sum = nums[j]+nums[i]+nums[k];
            if(sum==target) {
                st.add(List.of(nums[i],nums[j],nums[k]));
                j++;
                k--;
             while(j<k && nums[j]==nums[j-1])j++;
             while(j<k && nums[k]==nums[k+1])k--;
            }else if(sum<target){
                j++;
            }
            else{
                k--;
            }

            }

        }
        ans.addAll(st);

        return ans;
    }
}
