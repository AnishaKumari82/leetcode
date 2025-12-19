class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ns = new StringBuilder();
        int depth =0;

        for(char c : s.toCharArray()){
            if( c== '('){
                if(depth >0){
                ns.append(c);
            }
            depth++;

            }else{
                depth--;
                if( depth > 0){
                    ns.append(c);
                }
            }
            
        }
       
        return ns.toString();
    }
}