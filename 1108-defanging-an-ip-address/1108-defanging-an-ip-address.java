class Solution {
    public String defangIPaddr(String address) {
        int n = address.length();
        StringBuilder ip = new StringBuilder();

        for(int i=0;i<n ;i++ ){
            if(address.charAt(i)=='.'){
                ip.append("[.]");
               
            }else{
                ip.append(address.charAt(i));
            }
        }
        return String.valueOf(ip);
    }
}