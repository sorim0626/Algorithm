#include <stdio.h>

int main()
{
	int n;
	
	scanf("%d", &n);
	
	int s[n];
	int max = 0;
	float avg = 0;
	
	for (int i = 0; i < n; i++)
	{
		scanf("%d", &s[i]);
		
		if (s[i] > max)
		{
			max = s[i];
		}
	}
	
	for (int i = 0; i < n; i++)
	{
		avg += (float)s[i] / max * 100;
	}
	
	printf("%f", avg / n);
	
	return 0;
}