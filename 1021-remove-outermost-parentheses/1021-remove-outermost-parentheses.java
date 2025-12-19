// primitive is 
// It is non-empty
// It cannot be split into two non-empty valid parentheses strings

// 👉 Examples:

// "()" → primitive ✅

// "(())" → primitive ✅

// "()()" → ❌ not primitive (can be split into "()" + "()")


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


//wrong concept
//  for(int i =1 ; i <= s.length()-1
//         ;i++){
//             if(s.charAt(i)=='('){
//                 if(s.charAt(i+1)==')'){
//                 ns.append(s.charAt(i));
//                 ns.append(s.charAt(i+1));
//                 }
//             }else{
//                 continue;
//             }
//         }
//         return ns.toString();