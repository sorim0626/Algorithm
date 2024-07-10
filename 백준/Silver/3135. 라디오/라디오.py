a, b = map(int, input().split())
n = int(input())
favorites = []

for _ in range(n):
    f = int(input())
    favorites.append(f)

min_clicks = abs(a - b)


for fav in favorites:
    clicks = abs(fav - b) + 1  
    min_clicks = min(min_clicks, clicks)

print(min_clicks)