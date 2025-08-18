import java.util.Stack;
class StockSpanner {
    private Stack<int[]>st;
    private int idx;

    public StockSpanner() {
        this.idx = -1;   // initialize properly
        this.st = new Stack<>();
         
    }
    
    public int next(int price) {
        idx=idx+1;
        while(!st.isEmpty()&&st.peek()[0]<= price){
        st.pop();
        }
        int ans= idx-(st.isEmpty()?-1 :st.peek()[1]);
        st.push(new int[]{price,idx});
        return ans;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */