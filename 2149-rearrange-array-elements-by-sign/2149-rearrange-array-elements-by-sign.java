class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        int posIdx = 0;
        int negIdx = 1;

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                res[posIdx] = nums[i];
                posIdx += 2;
            } else {
                res[negIdx] = nums[i];
                negIdx += 2;
            }
        }

        return res;
    }
}





//BRUTE FORCE APPROACH
// class Solution {
//     public int[] rearrangeArray(int[] nums) {
//         int n = nums.length;

//         int[] pos = new int[n / 2];
//         int[] neg = new int[n / 2];

//         int p = 0, q = 0;  
//         //we can use static array but we can to take p and q to add the elements otherwise use arraylist to use arr.add() function

//         // Step 1: Separate positives and negatives
//         for (int i = 0; i < n; i++) {
//             if (nums[i] > 0) {
//                 pos[p++] = nums[i];
//             } else {
//                 neg[q++] = nums[i];
//             }
//         }

//         // Step 2: Rearrange alternately
//         for (int i = 0; i < n / 2; i++) {
//             nums[2 * i] = pos[i];
//             nums[2 * i + 1] = neg[i];
//         }

//         return nums;
//     }
// }
