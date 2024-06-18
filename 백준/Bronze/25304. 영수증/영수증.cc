#include <stdio.h>

int main()
{
	int x, n, a, b;
	scanf("%d", &x); // 총 금액
	scanf("%d", &n); // 물건의 종류의 수
	int sum = 0;
	for (int i = 0; i < n; i++)
	{
		scanf("%d %d", &a, &b); // a = 가격 b = 개수
		sum += a * b;
	}
	if (sum == x)
	{
		printf("Yes");
	}
	else
	{
		printf("No");
	}

	return 0;
}