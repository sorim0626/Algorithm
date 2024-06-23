#include <stdio.h>

int main()
{
    int a[9];
    int max = 0;
    int index;
    for(int i = 0; i < 9; i++)
    {
        scanf("%d", &a[i]);
    }
    for(int j = 0; j < 9; j++)
    {
        if(a[j] > max)
        {
            max = a[j];
            index = j;
        }
    }
    printf("%d\n", max);
    printf("%d\n", index + 1) ;
    
    
    return 0;
}