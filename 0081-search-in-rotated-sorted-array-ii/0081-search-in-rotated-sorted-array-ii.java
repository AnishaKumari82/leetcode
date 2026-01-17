class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int start=0;
        int high = n-1;
        
            
            while(start<=high){
                int mid = start+(high-start)/2;
                if(nums[mid]== target){
                    return true;
                }
                 if (nums[start] == nums[mid] && nums[mid] == nums[high]) {
                start++;
                high--;
                continue;
                 }
                if(nums[start] <=nums[mid] ){
                    if(target <nums[mid] && target >= nums[start]){
                        high = mid-1;
                    }else{
                        start= mid+1;
                    }
                }else{
                    if(target>nums[mid] && target<= nums[high]){
                        start = mid+1;
                    }else{
                        high = mid-1;
                    }
                }
            }
        return false;

    }
}