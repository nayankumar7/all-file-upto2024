/*

Name - Nayan Kumar Vishwakarma
Branch - computer science and engineering 
Semester - 02
Section - B

*/

//Q5-C Program to Check Whether a Number is Prime or Not

#include<stdio.h>

   int primeNum(){
   int n,i,m,z;
   printf("Enter integer value ; ");
       scanf("%d",&n);
   
   for(i = 2; i < n ; i++){
   m = n%i;
   if (m==0){
   z = 1;
   printf("\n Given Number is not Prime. \n");
   break;
   }
   }
   if (z != 1 ){
   printf(" Given Number is Prime. ");
   }
   return 0 ;
   }
      
   int main(){
  primeNum();
    return 0;
    }
   
   

   