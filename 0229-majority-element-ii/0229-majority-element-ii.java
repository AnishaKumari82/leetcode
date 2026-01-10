class Solution {
    public List<Integer> majorityElement(int[] arr) {
        List<Integer> ls = new ArrayList<>();
        int n = arr.length;
        int cnt1=0;
        int cnt2 =0;
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(cnt1 ==0 && arr[i]!=ele2){
                cnt1 =1;
                ele1=arr[i];
            } else if(cnt2 ==0 && arr[i]!=ele1){
                cnt2 =1;
                ele2=arr[i];
            }else if(arr[i]==ele1){
                cnt1++;
            }else if(arr[i]==ele2){
                cnt2++;
            }else{
                cnt1--;
                cnt2--;
            }
        } 
        cnt1 =0;
        cnt2=0;
        for(int i=0;i<n;i++){
            if(ele1==arr[i]) cnt1++;
            if(ele2==arr[i]) cnt2++;
        }
        int min =(n/3)+1;
        if(cnt1 >=min){
            ls.add(ele1);
        }
        if(cnt2 >=min){
            ls.add(ele2);
        }
        return ls;
    }
}




//BETTER APPROACH
// class Solution {
//     public List<Integer> majorityElement(int[] arr) {
//         List<Integer> ls = new ArrayList<>();
//         int n = arr.length;
//         HashMap<Integer,Integer> mpp = new HashMap<>();
//         int min= (n/3)+1;

//         for(int i=0;i<n;i++){
//             mpp.put(arr[i],mpp.getOrDefault((arr[i]),0)+1);
//             if(mpp.get(arr[i])==min){
//                 ls.add(arr[i]);
//         }
//         }
//         return ls;
//     }
// }





//BRUTE FORCE ---- O(N^2)
// class Solution {
//     public List<Integer> majorityElement(int[] nums) {
//         List<Integer> ls = new ArrayList<>();
//         int n = nums.length;
//         for(int i=0;i<n;i++){
//             if(ls.size()==0 || ls.get(0) != nums[i]){
//                  int cnt =0;
//                  for(int j =0;j<n;j++){
//                     if(nums[j]==nums[i]){
//                         cnt++;
//                     } 
//                  }
//                  if(cnt>n/3){
//                         ls.add(nums[i]);
//                     }

//                  if(ls.size()==2){
//                     break;
//                  }
//             }
//         }
//         return ls;
//     }
// }