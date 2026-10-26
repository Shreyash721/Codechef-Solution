# DRKTZ01 - Rating 1350

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Chef Solves Asteroid Collision

Chef is observing  **$asteroidList$**, a sequence of asteroids moving through space.
Each asteroid has:

- Size → given by its absolute value
- Direction → positive (moving right), negative (moving left)

When two asteroids moving toward each other collide:

- The smaller one explodes
- If they are equal, both are destroyed
- Asteroids moving in the same direction never collide

Chef wants to know the  **final surviving asteroids**  after all possible collisions.
Your task is to simulate these interactions and determine the final state.

## Function Declaration
- Function Name $resolveAsteroidCollisions$
- Parameters $asteroidList$: A list of integers where each value represents an asteroid.
- Return Value Returns a list of integers representing the asteroids that survive after all collisions. The order reflects their left-to-right positions.
## Constraints
- $1 \le T \le 10^5$
- $2 \le N \le 10^4$
- $-1000 \le asteroidList[i] \le 1000$
- $asteroidList[i] \neq 0$
## Input Format
- The first line contains a single integer $T$ — the number of test cases.
- For each test case: The first line contains an integer $N$ — the number of asteroids. The second line contains $N$ space-separated integers representing the $asteroidList$.
## Output Format
- For each test case, print a single line containing the asteroids remaining after all collisions.
- The asteroids should be printed in order from left to right.
- Each asteroid should be printed with its sign and size as in the input format.
### Sample 1:
Input
Output

```
4
3
4 3 -5
5
10 -10 5 -5 20
6
1 2 3 -4 -3 -2
7
8 9 -10 11 -12 13 -14
```

```
-5
20
-4 -3 -2
-10 -12 -14

```

### Explanation:

 **Test Case 1:** 
4 and 3 move right; -5 comes left and destroys both:  **Output: -5** 

 **Test Case 2:** 
10 meets -10 and both explode; 5 meets -5 and both explode; 20 remains:  **Output: 20** 

 **Test Case 3:** 
1, 2, 3 move right; -4 comes left and destroys all three; -4, -3, -2 stay:  **Output: -4 -3 -2** 

 **Test Case 4:** 
-10 destroys 9 and 8; -12 destroys 11; -14 destroys 13:  **Output: -10 -12 -14**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-26T08:16:31.556Z  

```java
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
```

---

[View on CodeChef](https://www.codechef.com/problems/DRKTZ01)