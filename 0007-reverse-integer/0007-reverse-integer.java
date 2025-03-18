class Solution {
    public int reverse(int n) {
        int revno=0;
        while(n != 0){
        
            int ld= n%10;
            revno= revno*10+ld;
            n=n/10;
        }
        return revno;
    }
}