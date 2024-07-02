#include <stdio.h>

int main() {
	int score1[5] = { 0 }, score2[5] = { 0 };
	int sum1=0, sum2=0;
	for (int i = 0; i < 4; i++) {
		scanf("%d", &score1[i]);
		sum1 += score1[i];
	}
	for (int i = 0; i < 4; i++) {
		scanf("%d", &score2[i]);
		sum2 += score2[i];
	}
	if (sum1 < sum2) printf("%d", sum2);
	else printf("%d", sum1);
	return 0;
}