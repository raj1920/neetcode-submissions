class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;

        while(left<right){
            char chlef=s.charAt(left);
            char chler= s.charAt(right);

            // skip left nonAphsNumeric char
            // was.     it 
            while(left<right && !isAplhanum(chlef)){
                left++;
                chlef=s.charAt(left);
            }

            // skip right 
            while(right>left && !isAplhanum(chler)){
                right--;
                chler=s.charAt(right);
            }

            // check if palindrome or not
            if(Character.toLowerCase(chler)!=Character.toLowerCase(chlef)) return false;
            left++;
            right--;
        }

        return true ;

}

    public boolean isAplhanum(char c){
        if(c>='A'&&c<='Z'||c>='a'&&c<='z' || c>='0'&&c<='9') return true;
        return false;
    }
}