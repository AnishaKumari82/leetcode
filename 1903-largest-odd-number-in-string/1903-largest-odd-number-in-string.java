class Solution {
    public String largestOddNumber(String num) {

        for (int i = num.length() - 1; i >= 0; i--) {
            int digit = num.charAt(i) - '0';

            if (digit % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }

        return "";
    }
}



// class Solution {
//     public String largestOddNumber(String num) {
//         int max = 0;
//         if((Integer.parseInt(num))%2 != 0){
//             return num;
//         }else{
//             for(int i =0; i<num.length();i++){
//             int ch = num.charAt(i) -'0';
//             if(ch%2 != 0){
//                 max=Math.max(max,ch);
                
//             }
//         }
//         String s = (max == 0) ? "" : String.valueOf(max);
//        return s;
//         }
        
//     }
// }