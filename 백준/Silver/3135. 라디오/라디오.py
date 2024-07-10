a, b = map(int, input().split())
n = int(input())
fav = []

for _ in range(n):
    f = int(input())
    fav.append(f)

m = abs(a - b)


for i in fav:
    c = abs(i - b) + 1  
    m = min(m, c)

print(m)
