class Solution {
    public int[] asteroidCollision(int[] as) {
        
        Stack<Integer> st = new Stack<>();
        for(int i=0 ; i < as.length ; i++ ){
            if(as[i]> 0){
                st.push(as[i]);
            }else{
                while(!st.isEmpty()&& st.peek()>0 && st.peek()< -as[i]){
                    st.pop();
                }
            }
            if(!st.isEmpty() && st.peek()== -as[i]){
                st.pop();
                
            }else{
                if(st.isEmpty() || st.peek()<0){
                    st.push(as[i]);
                }
            }

        }
        int[] result = new int[st.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = st.pop();
        }

        return result;
    }
}