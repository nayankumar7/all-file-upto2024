#include<stdio.h>
int main(){
    // 5.	C Program to Check Whether a Number is Prime or Not
    int n ;
scanf("%d",&n);

if(n==0 || n == 1 || n < 0 ){
    printf("%d is neither prime nor composite. ",n);
    
}
else if(n==2){
    printf("%d is prime number.",n);      
}else {
          for (int i =2 ; i<n; i++){
              if(n%i ==0 ){
          printf("%d is not prime number.",n); 
          break ;        
}else if (i ==n-1 ){
    printf("%d is prime number.",n);     
}else{}

   }
}
    return 0 ;
}