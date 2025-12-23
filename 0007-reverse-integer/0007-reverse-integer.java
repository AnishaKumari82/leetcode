class Solution {
    public int reverse(int n) {
        int revno=0;
        while(n != 0){
            int ld= n%10;
            if (revno > Integer.MAX_VALUE / 10 || revno < Integer.MIN_VALUE / 10) {
                return 0; // Return 0 in case of overflow
            }
            revno= revno*10+ld;
            n=n/10;
        }
        return revno;
    }
}