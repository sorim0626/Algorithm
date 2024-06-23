#include <stdio.h>

int main()
{
    int n;
    int a[1000000];
    scanf("%d", &n);
    int min = 1000000;
    int max = -1000000;
    for(int i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
    }
    for(int j = 0; j < n; j++)
    {
        if(a[j] > max)
        {
            max = a[j];
        }
        if(a[j] < min)
        {
            min = a[j];
        }
    }
    printf("%d %d", min, max);
    return 0;
}