class Solution {
    public int[] nextGreaterElements(int[] arr) {
        
        int n= arr.length;
        Stack<Integer> st = new Stack();
        int[] nge = new int[n];
        for(int i= 2*n-1 ; i>=0 ;i--){
            while(!st.isEmpty() && st.peek()<=arr[i%n] ){
                st.pop();
            }
            if(i<n){
                nge[i]= st.isEmpty() ? -1 : st.peek();
            }
            st.push(arr[i%n]);
        }        
        return nge;
    } 
}