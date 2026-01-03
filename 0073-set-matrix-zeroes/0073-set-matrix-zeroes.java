// optimalll
class Solution {
    public void setZeroes(int[][] matrix) {
        // Get dimensions of matrix
        int m = matrix.length;
        int n = matrix[0].length;

        // Flag to track if first row should be zeroed
        boolean firstRowZero = false;
        // Flag to track if first column should be zeroed
        boolean firstColZero = false;

        // Check if first row has any zero
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                firstRowZero = true;
                break;
            }
        }

        // Check if first column has any zero
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }

        // Use first row/column as markers
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Set cells to zero based on markers
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Zero the first row if needed
        if (firstRowZero) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

        // Zero the first column if needed
        if (firstColZero) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}


//BRUTE FORCE IN O(N^3)
// class Solution {
//     public void setZeroes(int[][] matrix) {
//         int n = matrix.length;
//         int m = matrix[0].length;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 if(matrix[i][j]==0){
//                    for(int col=0;col<m;col++){
//                        if(matrix[i][col]!=0){
//                           matrix[i][col]=-1;
//                        }
//                 }
//                 for(int row=0;row<n;row++){
//             if(matrix[row][j]!=0){
//             matrix[row][j]=-1;
//         }
//         }
//             }
//         }    

//     }
//     for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 if(matrix[i][j]==-1){
//                     matrix[i][j]=0;
//                 }
//             }
//         }
//     }}


//BETTER SOLUTION
//  class Solution {
//     public void setZeroes(int[][] matrix) {
//         // Get dimensions of matrix
//         int m = matrix.length;
//         int n = matrix[0].length;
//         boolean[] row= new boolean[m];
//         boolean[] col= new boolean[n];

//         for(int i=0;i<m;i++){
//             for(int j =0;j<n;j++){
//                 if(matrix[i][j]==0){
//                     row[i]=true;
//                     col[j]=true;
//                 }
//             }

//         }

//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 if(row[i] || col[j]){
//                     matrix[i][j]=0;
//                 }
//             }
//         }
//     }
//  }

