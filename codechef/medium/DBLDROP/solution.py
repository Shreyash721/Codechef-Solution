t=int(input())
for _ in range(t):
    n=int(input())
    a=list(map(int,input().split()))
    s=sum(a)
    m=max(a)
    ans=s-m
    for x in a:
        ans=max(ans,s+x-max(m,2*x))
    print(ans)