snack, n, money = map(int, input().split())

if snack * n > money:
    print(snack * n - money)
else:
    print("0")