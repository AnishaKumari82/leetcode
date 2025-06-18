class Solution {
    public int trap(int[] h) {
        int leftm=0 , rightm=0, total=0, l=0, r=h.length-1;
        while(l<r){
            if(h[l] <= h[r]){
                if(leftm >= h[l]){
                    total+= leftm - h[l];

                }else{
                    leftm=h[l];
                    
                }
                l=l+1;
            }else{
                
                if(rightm>=h[r]){
                    total+=rightm- h[r];

                }else{
                    rightm=h[r];
                    
                }
                r=r-1;
            }
        }
        return total;
        
    }
}