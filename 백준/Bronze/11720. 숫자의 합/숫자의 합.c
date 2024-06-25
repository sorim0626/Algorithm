#include <stdio.h>

int main()
{
	int n, i;
	char a[100];
	int sum = 0; 

	scanf("%d", &n);
	scanf("%s", a);

	for (i = 0; i < n; i++)
	{
		sum = sum + a[i] - '0';
	}

	printf("%d", sum);

	return 0;
}