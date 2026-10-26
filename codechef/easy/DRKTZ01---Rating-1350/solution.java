public int[] resolveAsteroidCollisions(int[] a) {
    Stack<Integer> st = new Stack<>();

    for (int x : a) {
        boolean alive = true;

        while (alive && x < 0 && !st.isEmpty() && st.peek() > 0) {
            if (st.peek() < -x) {
                st.pop();
            } else if (st.peek() == -x) {
                st.pop();
                alive = false;
            } else {
                alive = false;
            }
        }

        if (alive) {
            st.push(x);
        }
    }

    int[] ans = new int[st.size()];

    for (int i = 0; i < st.size(); i++) {
        ans[i] = st.get(i);
    }

    return ans;
}