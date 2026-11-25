from itertools import permutations
t=int(input())
for _ in range(t):
    n,m=map(int,input().split())
    r,c=map(int,input().split())
    p=[(1,1),(1,m),(n,1),(n,m)]
    ans=float('inf');
    for q in permutations(p):
        x,y=r,c
        s=0
        for a,b in q:
            s+=max(abs(x-a),abs(y-b))
            x,y=a,b
        ans=min(ans,s)
    print(ans)