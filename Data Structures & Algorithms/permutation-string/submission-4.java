class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1=s1.length();
        int n2=s2.length();
        if(n1>n2) return false;

        int[] target = new int[26];
        int[] window = new int[26];
        for(int i=0;i<n1;i++){
            target[(s1.charAt(i)-'a')]++;
            window[(s2.charAt(i)-'a')]++;
        }
        int match =0;
        for(int i=0;i<26;i++){
            if(target[i]==window[i]) match++;
        }

        for(int i=n1;i<n2;i++){
            if(match==26) return true;

            int left = s2.charAt(i-n1)-'a';
            int right = s2.charAt(i)-'a';
            window[left]--;
            window[right]++;
            if (right == left) continue;
            if(window[right]==target[right]){
                match++;
            }else if(window[right]==target[right]+1){
                match--;
            }

            if(window[left]==target[left]){
                match++;
            }else if(window[left]==target[left]-1){
                match--;
            }
        } return match==26;
    }
}
