n = int(input())
vote = [] 

for _ in range(n):
    vote.append(int(input()))

d = vote[0]  
o = vote[1:]  

if n == 1:
    print(0)
else:
    cnt = 0  
    
    while d <= max(o):
        o.sort(reverse=True)  
        d += 1  
        o[0] -= 1  
        cnt += 1  
    
    print(cnt)
