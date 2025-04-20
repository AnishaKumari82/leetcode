class MinStack {
    Stack<Long> st = new Stack<>();
    long min = Long.MAX_VALUE;

    public MinStack() {
    }

    public void push(int val) {
        long value = val;
        if (st.isEmpty()) {
            min = value;
            st.push(value);
        } else {
            if (value > min) {
                st.push(value);
            } else {
                st.push(2 * value - min); // encoded
                min = value;
            }
        }
    }

    public void pop() {
        if (st.isEmpty()) return;

        long top = st.pop();
        if (top < min) {
            min = 2 * min - top; // decode previous min
        }
    }

    public int top() {
        if (st.isEmpty()) return -1;

        long top = st.peek();
        if (top >= min) {
            return (int) top;
        } else {
            return (int) min;
        }
    }

    public int getMin() {
        return (int) min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */