class StackUsingQueues {
    Queue<Integer> q=new LinkedList<>();
    Queue<Integer> q2=new LinkedList<>();
    public void push(int x) {
        q2.add(x);
        while(!q.isEmpty()){
            q2.add(q.poll());
        }
        Queue<Integer> temp=q;
        q=q2;
        q2=temp;
    }
    
    public int pop() {
       return q.poll();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
       return q.isEmpty();
    }
    
}