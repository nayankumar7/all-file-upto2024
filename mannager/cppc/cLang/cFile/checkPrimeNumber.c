#include<stdio.h>

   int primeNum(){
   int n,i,m,z;
       scanf("%d",&n);
   
   for(i = 2; i < n ; i++){
   m = n%i;
   if (m==0){
   z = 1;
   printf("not prime ");
   break;
   }
   }
   if (z!=1){
   printf("prime");
   }
   return 0 ;
   }
      
   int main(){
  primeNum();
    return 0;
    }
   
   

   