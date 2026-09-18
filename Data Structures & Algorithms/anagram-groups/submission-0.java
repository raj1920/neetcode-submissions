class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp = new HashMap<>();
      for(int i=0;i<strs.length;i++){
        char[] st = strs[i].toCharArray();
        Arrays.sort(st);
        String key = String.valueOf(st); 
        mp.computeIfAbsent(key, k -> new ArrayList<>()).add(strs[i]);
      
      } 
      List<List<String>> ans = new ArrayList<>(mp.values()); 

      return ans;
    }
}
