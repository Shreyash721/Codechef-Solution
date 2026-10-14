# cook your dish here
import heapq
t=int(input())
for _ in range(t):
    n,k=map(int,input().split())
    arr=list(map(int,input().split()))
    heapq.heapify(arr)
    
    for _ in range(k):
        a=heapq.heappop(arr)
        b=heapq.heappop(arr)
        heapq.heappush(arr,a+b)
        
        
    print(max(arr))