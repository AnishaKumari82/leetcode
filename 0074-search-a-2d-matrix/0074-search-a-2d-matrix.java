class Solution {
    public boolean searchMatrix(int[][] nums, int k){
        int n = nums.length;
        int m = nums[0].length;
        int low =0;
        int high = n* m-1;

        while(low<=high){
        int mid = (low+high)/2;

        
        int row = mid /m;
        int col = mid%m;

        if(nums[row][col]==k){
            return true;
        }else if(nums[row][col] > k){
            high= mid-1;
        }else{
            low=mid+1;
        }
    }
    return false;
    }
}
        


// class Solution {
//     public boolean searchinrow(int[] nums, int k){
//         int n = nums.length;
//         int low =0;
//         int high = n-1;
//         while(low<=high){
//         int mid = (low+high)/2;
//         if(nums[mid]==k){
//             return true;
//         }else if(nums[mid] > k){
//             high= mid-1;
//         }else{
//             low=mid+1;
//         }
//     }
//     return false;
//     }
//         public boolean searchMatrix(int[][] matrix, int target) {
//             int n = matrix.length;
//             int m = matrix[0].length;

//             for(int i=0;i<n;i++){
//                 if(target >=matrix[i][0] && target <= matrix[i][m-1]){
//                     return searchinrow(matrix[i] , target);
//                 }
//             }
//             return false;
//     }
// }