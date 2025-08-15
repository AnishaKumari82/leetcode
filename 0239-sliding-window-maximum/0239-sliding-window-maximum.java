import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    public int[] maxSlidingWindow(int[] a, int k) {
        int n = a.length;
        int[] r = new int[n - k + 1];
        int ri = 0;

        Deque<Integer> q = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            // Remove indices out of window
            if (!q.isEmpty() && q.peek() == i - k) {
                q.poll();
            }
            // Remove smaller elements in k range as they are useless
            while (!q.isEmpty() && a[q.peekLast()] < a[i]) {
                q.pollLast();
            }
            q.offer(i);

            // Store max for current window
            if (i >= k - 1) {
                r[ri++] = a[q.peek()];
            }
        }
        return r;
    }
}
