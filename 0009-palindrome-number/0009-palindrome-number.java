class Solution {
    public boolean isPalindrome(int x) {
        int revno = 0;
        int dup = x;
        if (x < 0) {
            return false;
        }

        while(x != 0){
            int ld= x%10;
            if (revno > Integer.MAX_VALUE / 10 || revno < Integer.MIN_VALUE / 10) {
                return false; // Return 0 in case of overflow
            }
            revno = revno*10+ld;
            x = x/10;
        
        }
        return( dup == revno);
        
    }
}