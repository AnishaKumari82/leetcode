class Solution {
    public long subArrayRanges(int[] nums) {
         return getSumOfMaximums(nums) - getSumOfMinimums(nums);
        
    }

       
private long getSumOfMaximums(int[] nums) {
    int n = nums.length;
    Stack<Integer> stack = new Stack<>();
    long sum = 0;

    for (int i = 0; i <= n; i++) {
        while (!stack.isEmpty() && (i == n || nums[stack.peek()] < (i < n ? nums[i] : Integer.MAX_VALUE))) {
            int j = stack.pop();
            int k = stack.isEmpty() ? -1 : stack.peek();
            sum += (long) nums[j] * (i - j) * (j - k);
        }
        stack.push(i);
    }

    return sum;
}
private long getSumOfMinimums(int[] nums) {
    int n = nums.length;
    Stack<Integer> stack = new Stack<>();
    long sum = 0;

    for (int i = 0; i <= n; i++) {
        while (!stack.isEmpty() && (i == n || nums[stack.peek()] > (i < n ? nums[i] : Integer.MIN_VALUE))) {
            int j = stack.pop();
            int k = stack.isEmpty() ? -1 : stack.peek();
            sum += (long) nums[j] * (i - j) * (j - k);
        }
        stack.push(i);
    }

    return sum;
}


}
