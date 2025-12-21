class Solution {
    public String reverseWords(String s) {
        StringBuilder ns = new StringBuilder();
        List <String> arr = new ArrayList<>();
        
        for(int i=0; i< s.length(); i++){
            char ch = s.charAt(i);
            if( ch != ' '){
                ns.append(ch);
            }else if (ns.length() > 0){
                arr.add(ns.toString());
                ns.setLength(0);
            }
        
        }

        if (ns.length() > 0) {
            arr.add(ns.toString());
        }
        Collections.reverse(arr);
        String withSpaces = String.join(" ", arr); 
        return withSpaces;
    }
}