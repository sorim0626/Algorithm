#include <stdio.h>

int main(void) {
    int a,b;
    while(scanf("%d %d", &a, &b)!=EOF) {  // EOF는 End Of File의 약자 
        printf("%d\n", a+b);              // 파일의 끝을 표현하기 위한 상수( -1의 값을 가짐)
    }
}
