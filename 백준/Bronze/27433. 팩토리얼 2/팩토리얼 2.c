#include <stdio.h>

long long int fac(long long int n)
{
  
  if(n == 0)
  {
      return 1;
  }
   return n * fac(n - 1);
  
}
int main()
{
    long long int n;
    
    scanf("%lld", &n);
    
    fac(n);
    
    printf("%lld", fac(n));
    
    return 0;
}