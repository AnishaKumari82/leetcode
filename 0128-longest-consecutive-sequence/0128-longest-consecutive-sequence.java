class Solution {
    public int longestConsecutive(int[] arr){
            int longest =1;
             Set <Integer> st = new HashSet<>();
             for(int i=0;i<arr.length;i++){
                st.add(arr[i]);
             }
             if(arr.length==0){
                return 0;
             }
             for( int it: st){
                
                if(!st.contains(it-1)){
                    int cnt =1;
                    int x=it;

                
                while(st.contains(x+1)){
                    cnt = cnt+1;
                    x=x+1;
                    
             }
             longest= Math.max(longest,cnt);
    }}
    return longest;
}
}





// BRUTE FORCE
// class Solution {
//     private boolean linearsearch(int[] arr , int a){
//             for(int i =0;i<arr.length;i++){
//                 if(arr[i]==a){
//                     return true;
//                 }
//             }
//             return false;
//         }
//     public int longestConsecutive(int[] nums) {
//         int longest =1;
//         for(int i =0;i< nums.length;i++){
//             int x = nums[i];
//             int cnt =1;
//             while(linearsearch(nums,x+1)==true){
//                 cnt++;
//                 x=x+1;   
//             }
//             longest = Math.max(longest, cnt);
//         }
//         return longest;
//     }
// }

        
