//method 1 optimal tc o(n)

class Solution {
    public int diagonalSum(int[][] mat) {
        int sum =0;
        for(int i=0; i< mat.length; i++){
            sum += mat[i][i];
            sum += mat[i][mat.length-i-1];
        }
        if(mat.length %2==0){
            return sum;
        }else{
            return sum- mat[mat.length/2][mat.length/2];

        }
       
        
    }
}


//method 2...............
// class Solution {
//     public int diagonalSum(int[][] mat) {
//         int sum =0;
//         for(int i=0; i< mat.length; i++){
//             for(int j =0; j<mat.length; j++){
//                 if(i==j || i+j == mat.length-1){
//                     sum=sum+ mat[i][j];
//                 }
                
//             }
//         }
       
//         return sum;
//     }
// }