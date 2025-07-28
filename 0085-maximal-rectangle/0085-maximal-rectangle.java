import java.util.*;

class Solution {

    private int[] nextSmallerElement(int[] arr, int n) {
        Stack<Integer> s = new Stack<>();
        int[] ans = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            ans[i] = s.isEmpty() ? -1 : s.peek();
            s.push(i);
        }
        return ans;
    }

    private int[] prevSmallerElement(int[] arr, int n) {
        Stack<Integer> s = new Stack<>();
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            ans[i] = s.isEmpty() ? -1 : s.peek();
            s.push(i);
        }
        return ans;
    }

    private int largestRectangleArea(int[] heights, int n) {
        int[] next = nextSmallerElement(heights, n);
        int[] prev = prevSmallerElement(heights, n);

        int area = 0;
        for (int i = 0; i < n; i++) {
            int height = heights[i];
            if (next[i] == -1) {
                next[i] = n;
            }
            int width = next[i] - prev[i] - 1;
            int newArea = height * width;
            area = Math.max(area, newArea);
        }
        return area;
    }

    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return 0;

        int n = matrix.length;
        int m = matrix[0].length;

        int[] heights = new int[m];
        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            // Update histogram heights row by row
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == '1') {
                    heights[j] += 1;
                } else {
                    heights[j] = 0;
                }
            }
            maxArea = Math.max(maxArea, largestRectangleArea(heights, m));
        }
        return maxArea;
    }
}