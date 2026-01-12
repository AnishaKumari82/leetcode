class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}




//WRONG SOLUTION
// class Solution {
//     public boolean isPowerOfTwo(int n) {
//         if(n==1){
//             return true;
//         }
//         for(int i=0;i<= n;i++){
//             if(Math.pow(2,i) == n){
//                 return true;
//             }
//         }
//         return false;
//     }
// }