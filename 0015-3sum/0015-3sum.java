class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> st = new ArrayList<>();
        int n = nums.length;

        for(int i=0;i<n-1;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;

            int j=i+1;
            int k = n-1;

            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum<0){
                    j++;
                }else if(sum>0){
                    k--;
                }else {
                    List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k]);
                    st.add(temp);
                    j++;
                    k--;
                    while(j<k && nums[j] == nums[j-1]) j++;
                    while(j<k && nums[k] == nums[k+1]) k--;
                }
            }
        
        }
        return st;

    }
}






//BETTER SOLUTION.......................................................................
// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         Set<List<Integer>> st = new HashSet<>();
//         int n = nums.length;

//         for(int i=0;i<n;i++){
//             Set<Integer> trip = new HashSet<>();
//             for(int j=i+1;j<n;j++){
//                 int third = -(nums[i]+nums[j]);

//                 if(trip.contains(third)){
//                     List<Integer> temp = Arrays.asList(nums[i],nums[j],third);
//                     Collections.sort(temp);
//                     st.add(temp);
//                 }
//                 trip.add(nums[j]);
//             }

//         }
//         return new ArrayList<>(st);

//     }
// }




//BRUTE FORCE...............................................................................
// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         Set<List<Integer>> st = new HashSet<>();
//         int n = nums.length;

//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 for(int k=j+1;k<n;k++){
//                     if(nums[i]+nums[j]+nums[k]==0){
//                         List<Integer> nl = Arrays.asList(nums[i],nums[j],nums[k]);
//                         Collections.sort(nl);
//                         st.add(nl);
//                     }
//                 }
//             }
//         }
//         return new ArrayList<>(st);
//     }
// }