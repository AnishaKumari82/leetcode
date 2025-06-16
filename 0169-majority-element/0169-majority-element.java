class Solution {
    public int majorityElement(int[] a) {
        int cnt =0;
        int el =0;
        for(int i =0; i< a.length ; i++ ){
            if(cnt ==0){
                cnt=1;
                el=a[i];
            }
            else if(a[i]==el){
                cnt++;
            }else{
                cnt--;
            }
            

        }
        int cnt1=0;
        for(int i =0; i< a.length; i++){
            if(a[i]==el){
                cnt1++;
            }
        }
        if(cnt1 > a.length/2){
            return el;
        }
        return -1;
    }
        
}