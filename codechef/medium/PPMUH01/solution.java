class QueueUsingStacks {
    Stack<Integer> st=new Stack<>();
    Stack<Integer> st2=new Stack<>();
    public void pushElement(int x) {
        st2.push(x);
        while(!st.isEmpty()){
            st2.push(st.pop());
        }
        Stack<Integer> temp=st;
        st=st2;
        st2=temp;
    }
    
    public int popElement() {
        return st.pop();
    }
    
    public int peekElement() {
        return st.peek();
    }
    
    public boolean isEmptyResult() {
        return st.isEmpty();
     }
}
    