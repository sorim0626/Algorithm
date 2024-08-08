a = list(map(int, input().split()))
a.sort()
n = len(a)
for i in range(n):
    print(a[i], end=" ")
