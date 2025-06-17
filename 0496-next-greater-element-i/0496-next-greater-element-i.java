class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();  // Map from num to its next greater element
        Stack<Integer> st = new Stack<>();
        
        for (int i = nums2.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && nums2[i] >= st.peek()) {
                st.pop();
            }
            map.put(nums2[i], st.isEmpty() ? -1 : st.peek());
            st.push(nums2[i]);
        }
        
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]);
        }
        
        return result;
    }
}