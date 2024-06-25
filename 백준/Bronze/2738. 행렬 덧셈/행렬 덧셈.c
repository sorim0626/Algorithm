#include <stdio.h>

int main()
{	
	int n, m;
	int i, j;

	scanf("%d %d", &n, &m);

	int a[100][100];
	int b[100][100];

	// a 행
	for (i = 0; i < n; i++)
	{
		for (j = 0; j < m; j++)
		{
			scanf("%d", &a[i][j]);
		}
	}
	// b 행
	for (i = 0; i < n; i++)
	{
		for (j = 0; j < m; j++)
		{
			scanf("%d", &b[i][j]);
		}
	}
	// 행 더하기 
	for (i = 0; i < n; i++)
	{
		for (j = 0; j < m; j++)
		{
			printf("%d ", a[i][j] + b[i][j]);
		}
		printf("\n");
	}

	return 0;
}