class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(char c : s.toCharArray()){
            if(!st.empty()){
                char x = st.peek();
                if(x=='(' && c==')'){
                    st.pop();
                }else if(x=='{' && c=='}'){
                    st.pop();
                } else if(x=='[' && c==']'){
                    st.pop();
                } else {
                    st.push(c);
                }
            }else{
                st.push(c);
            }
            
        }

        if(st.empty()) return true;

        return false;
    }
}
