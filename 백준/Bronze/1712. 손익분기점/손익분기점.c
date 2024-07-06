#include <stdio.h>

int main()
{
	int a, b, c;

	scanf("%d %d %d", &a, &b, &c);
	
	if (c <= b)
	{
		printf("-1\n");
		return 0;
	}

	int d = a / (c - b) + 1;

	printf("%d\n", d);

	return 0;
}