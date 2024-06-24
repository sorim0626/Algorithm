#include <stdio.h>
#include <string.h>
int main()
{
	int n;
	char a[1001];

	scanf("%d", &n);

	for (int i = 0; i < n; i++)
	{
		scanf("%s", a);
		int len = strlen(a);
		printf("%c%c\n", a[0], a[len - 1]);
	}
	return 0;
}