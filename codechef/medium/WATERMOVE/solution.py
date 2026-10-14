# cook your dish here
import heapq
t=int(input())
for _ in range(t):
    n,k=map(int,input().split())
    arr=list(map(int,input().split()))
    arr.sort()
    for i in range(k):
        arr[i+1]+=arr[i];
    
    # for _ in range(k):
    #     a=heapq.heappop(arr)
    #     b=heapq.heappop(arr)
    #     heapq.heappush(arr,a+b)
        
        
    print(max(arr))