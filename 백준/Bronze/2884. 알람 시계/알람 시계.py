h, m = map(int, input().split())

if h == 0 and m < 45:
    print("23", m + 60 - 45)
elif m < 45:
    print(h - 1, m + 60 - 45)
else:
    print(h, m - 45)