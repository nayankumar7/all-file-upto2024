#include<stdio.h>

int main() {int n ;
scanf("%d",&n);
int l = 0;int m=1;
printf("\n %d \n %d",l,m);

    for(int i = 1; i<=n-2;i++){
        
       
        int v = l+m ;
         l = m ;
        
        
        printf("\n %d ",v);
        m = v ;
        
    
    }
    
    
    return 0;
}