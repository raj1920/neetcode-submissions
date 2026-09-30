class Solution {
    public String minWindow(String s, String t) {
        int n1= s.length();
        int n2= t.length();
        if(n2>n1) return "";
        int[] target = new int[128];
        int[] window = new int[128];

        for(char ch : t.toCharArray()){
            target[ch]++;
        }

        int l=0;
        int start=0;
        int minLen=Integer.MAX_VALUE;
        int count = n2;
        for(int r=0;r<n1;r++){
            int ele = s.charAt(r);
            window[ele]++;
          if(target[ele]>0 && window[ele]<=target[ele]){
            count--;
          }
          while(count==0){
            if(minLen>r-l+1){
                minLen=r-l+1;
                start=l;
            }
            int remove = s.charAt(l);
            window[remove]--;
            if(target[remove]>0 && window[remove]<target[remove]){
                count++;
            } 
            l++;
          }

        }

        
        return minLen==Integer.MAX_VALUE? "":s.substring(start,start+minLen);
    }
}
