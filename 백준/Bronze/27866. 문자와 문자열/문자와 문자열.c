#include <stdio.h>

int main()
{
	char s[1000];
	int i;
	scanf("%s", s);
	scanf("%d", &i);
	printf("%c", s[i - 1]);

	return 0;
}