class Solution {

    private String s;
    private Long[][][][] dp;

    public long countBalanced(long low, long high) {
        return (long)(countUpTo(high) - countUpTo(low - 1));
    }

    private long countUpTo(long x) {
        if (x < 10) return 0;
        s = Long.toString(x);
        dp = new Long[s.length()][401][2][2];
        return dfs(0, 0, 1, 0);
    }

    // pos, diff, tight, started
    private long dfs(int pos, int diff, int tight, int started) {

        if (pos == s.length()) {
            return (started == 1 && diff == 0) ? 1 : 0;
        }

        if (dp[pos][diff + 200][tight][started] != null) {
            return dp[pos][diff + 200][tight][started];
        }

        long res = 0;
        int limit = (tight == 1) ? s.charAt(pos) - '0' : 9;

        for (int d = 0; d <= limit; d++) {
            int newTight = (tight == 1 && d == limit) ? 1 : 0;

            if (started == 0 && d == 0) {
                res += dfs(pos + 1, diff, newTight, 0);
            } else {
                int newDiff = diff;

                int positionFromLeft = s.length() - pos;

                if (positionFromLeft % 2 == 1) {
                    newDiff += d;   // odd position
                } else {
                    newDiff -= d;   // even position
                }

                res += dfs(pos + 1, newDiff, newTight, 1);
            }
        }

        return dp[pos][diff + 200][tight][started] = res;
    }
}
