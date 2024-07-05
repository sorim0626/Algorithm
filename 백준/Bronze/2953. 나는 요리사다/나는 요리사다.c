#include <stdio.h>

int main()
{
	int s[5][4];
	int sum[5] = { 0 };
	int w = 0;
	for (int i = 0; i < 5; i++)
	{
		for (int j = 0; j < 4; j++)
		{
			scanf("%d", &s[i][j]);
		}
	}
	for (int i = 0; i < 5; i++)
	{
		for (int j = 0; j < 4; j++)
			sum[i] += s[i][j];
	}
	for (int i = 0; i < 5; i++)
	{
		if (sum[i] > sum[w])
		{
			w = i;
		}
	}

	printf("%d %d\n", w + 1, sum[w]);

	return 0;
}