#include <stdio.h>

int main()
{
	int a[9][9];
	int i, j;
	int max = 0; 
	int c = 0, b = 0;

	// 값 넣기 
	for (i = 0; i < 9; i++)
	{
		for (j = 0; j < 9; j++)
		{
			scanf("%d", &a[i][j]);
		}
	}
	
	// 최댓값 찾기
	for (i = 0; i < 9; i++)
	{
		for (j = 0; j < 9; j++)
		{
			if (a[i][j] > max)
			{
				max = a[i][j];
				b = i;
				c = j;
			}
		}
	}

	printf("%d\n", max);
	printf("%d %d\n", b + 1, c + 1);
	return 0;
}