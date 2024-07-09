#include <stdio.h>

int main() 
{
    int n; 
    int i, seat;
    int cnt = 0;
    int seats[101] = {0}; 
    
    scanf("%d", &n);

    
    for (i = 0; i < n; i++) 
    {
        scanf("%d", &seat);
        
        if (seats[seat] == 0) 
        {
            seats[seat] = 1; 
        } 
        else 
        {
            cnt++;
        }
    }

    printf("%d\n", cnt);

    return 0;
}
