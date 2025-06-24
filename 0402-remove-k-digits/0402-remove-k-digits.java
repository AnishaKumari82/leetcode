

class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < num.length(); i++) {
            char curr = num.charAt(i);
            while (!stack.isEmpty() && k > 0 && stack.peek() > curr) {
                stack.pop();
                k--;
            }
            stack.push(curr);
        }

        // Remove remaining digits if k > 0
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }

        // Build the result string
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        // Reverse because digits were added in reverse order
        sb.reverse();

        // Remove leading zeros
        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        // If empty, return "0"
        return sb.length() == 0 ? "0" : sb.toString();
    }
}



        
