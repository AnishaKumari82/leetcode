class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> mpp = new HashMap<>();
        int presum =0;
        int cnt =0;
        mpp.put(0,1);


        for(int i=0;i<nums.length;i++){
            presum += nums[i];
            int remove = presum-k;

            if(mpp.containsKey(remove)){
                cnt += mpp.get(remove);

            
            }
            mpp.put(presum, mpp.getOrDefault(presum, 0) + 1);
        }
        return cnt;
    }
}




//better solution
// class Solution {
//     public int subarraySum(int[] nums, int k) {
        
//         int cnt =0;
//         for(int i =0;i<nums.length;i++){
//             int sum =0;
//             for(int j=i;j<nums.length ; j++){
//                 sum = sum+nums[j];
//                 if (sum == k) {
//                     cnt++;
//                 }
//                 }

//             }
        
//         return cnt;
//     }
// }


// class Solution {
//     public int subarraySum(int[] nums, int k) {
        
//         int cnt =0;
//         for(int i =0;i<nums.length;i++){
//             for(int j=0;j<nums.length ; j++){
//                 int sum =0;
//                 for (int m = i; m <= j; m++) {
//                     sum += nums[m];
//                 }
//                 if (sum == k) {
//                     cnt++;
//                 }
//                 }

//             }
        
//         return cnt;
//     }
// }