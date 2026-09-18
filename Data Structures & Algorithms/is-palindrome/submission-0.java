class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;

        while(left<right){
            char chlef=s.charAt(left);
            char chler= s.charAt(right);

            // skip left nonAphsNumeric char
            // was.     it 
            while(left<right && !Character.isLetterOrDigit(chlef)){
                left++;
                chlef=s.charAt(left);
            }

            // skip right 
            while(right>left && !Character.isLetterOrDigit(chler)){
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
}