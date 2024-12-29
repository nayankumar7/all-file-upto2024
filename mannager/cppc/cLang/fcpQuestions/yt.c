#include<stdio.h>
int main(){
    int a = 10;
    int b = 20;
    int c = 30;
    {
         c = b-a;
        printf("%d",c);
    }
printf("%d",c);
    return 0 ;
}