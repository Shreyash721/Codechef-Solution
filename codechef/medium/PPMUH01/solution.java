class QueueUsingStacks {
    Stack<Integer> st=new Stack<>();
    Stack<Integer> st2=new Stack<>();
    public void pushElement(int x) {
        st.push(x);
    }
    
    public int popElement() {
      if(st2.isEmpty()){
            while(!st.isEmpty()) st2.push(st.pop());
        }
        return st2.pop();
    }
    
    public int peekElement() {
        if(st2.isEmpty()){
            while(!st.isEmpty()) st2.push(st.pop());
        }
        return st2.peek();
    }
    
    public boolean isEmptyResult() {
        return st.isEmpty() && st2.isEmpty();
     }
}
    