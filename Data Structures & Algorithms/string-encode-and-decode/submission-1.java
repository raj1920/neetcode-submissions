class Solution {

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
       for(String st : strs){
            res.append(st.length()).append('#').append(st);
          
       }
        System.out.println(res.toString());
       return res.toString();
    }

    public List<String> decode(String str) {
       List<String> res = new ArrayList<>();

       int i =0;
       while(i<str.length()){
        int j =i;
        while(str.charAt(j)!='#'){
            j++;
        }
        System.out.println(str.substring(i,j).toString());
        int len = Integer.parseInt(str.substring(i,j));
         i=j+1;
         j=i+len;
        res.add(str.substring(i,j));
        i=j;

       }
    return res;
    }
}
