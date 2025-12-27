class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> occ = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(occ.contains(nums[i])==true){
                return true;
            }else{
                occ.add(nums[i]);
            }
        }
        return false;
    }
}




// class Solution {
//     public boolean containsDuplicate(int[] nums) {
        
//         Arrays.sort(nums);
//         for(int i=0;i<nums.length-1;i++){
//             if(nums[i]==nums[i+1]){
//                 return true;
//             }
//         }
//         return false;
//     }
// }


// class Solution {
//     public boolean containsDuplicate(int[] nums) {
        
//         for(int i=0;i< nums.length;i++){
//             for(int j =i+1;j< nums.length;j++){
//                 if(nums[i]==nums[j]){
//                     return true;
//                 }
//             }

//         }
//         return false;
//     }
// }