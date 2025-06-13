class Solution {
    public void moveZeroes(int[] a) {
        int j=-1;
        for(int i =0 ; i<a.length; i++){
            if(a[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1) return;
        for(int i=j+1; i<a.length ;i++){
            if(a[i]!=0){
                int temp = a[i];
                a[i]= a[j];
                a[j]=temp;
                j++;
            }
        }
    }
}