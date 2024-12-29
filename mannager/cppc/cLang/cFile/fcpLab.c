#include<stdio.h>
int main (){
// Q.01- C Hello World Program
/*
    printf("Hello World");
    return 0 ;
}
*/
//Q.02- C Program to Print Your Own Name 
/*
    printf("Nayan Kumar Vishwakarma");
  */

//Q.03- C Program to Print an Integer Entered By the User
/*
int n ;
scanf("%d",&n);
printf("%d",n);
*/

//Q.04- C Program to Add Two Numbers
/*
int a,b,c;
a=3;b=4;c=a+b;printf("%d",c);
*/


//Q.05- C Program to Check Whether a Number is Prime or Not

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


//Q.06- C Program to Multiply two Floating-Point Numbers 
/*
float a , b , c ; a = 5.4 ; b = 4.2 ; c = a * b ;
printf ("%f", c);
*/


//Q.07- C Program to Print the ASCII Value of a Character
/*


*/
//Q.08- C Program to Swap Two Numbers
/*
int a = 5 ; int b = 4 ;
int temp = b ;
b = a ;
a = temp ;
printf("a = %d , b = %d ",a,b);
*/
// Q.09- C Program to Calculate Fahrenheit to Celsius



//Q.10- C Program to Find the Size of int, float, double, and char


//Q.11- C Program to Add Two Complex Numbers 


//Q.12- C Program to Print Prime Numbers From 1 to N 


//Q.13- C Program to Find Simple Interest


//Q.14- C Program to Find Compound Interest


//Q.15- C Program for Area And Perimeter Of Rectangle 


//Q.16-C Program to Check Whether a Number is Positive, Negative, or Zero


//Q.17-C Program to Check Whether Number is Even or Odd


//Q.18-C Program to Check Whether a Character is Vowel or Consonant 


//Q.19-C Program to Find Largest Number Among Three Numbers


//Q.20-C Program to Calculate Sum of Natural Numbers 


//Q.21-C Program to Print Alphabets From A to Z Using Loop


//Q.22-C Program to Check Leap Year


//Q.23- C Program to Find Factorial of a Number


//Q.24-C Program to Make a Simple Calculator 


//Q.25-C Program to Generate Multiplication Table 


//Q.26-C Program to Print Fibonacci Series


//Q.27-C Program to Reverse a Number


//Q.28- C Program to Check Whether a Number is a Palindrome or Not 


//Q.29- C Program to Check Whether a Number is Prime or Not


//Q. 30- C Program to Print a 2D Array


//Q.31- C Program to Find the Largest Element in an Array


//Q.32- C Program to Find the Maximum and Minimum in an Array


//Q.33-C Program to Search an Element in an Array (Binary search)


//Q.34-C Program to Check Prime Number By Creating a Function 


//Q.35- C Program to Display Prime Numbers Between Two Intervals Using Functions 


//Q.36 -C Program to Find All Roots of a Quadratic Equation


//Q.37- C Program to Check Whether a Number can be Express as Sum of Two Prime Numbers


//Q.38-C Program to Find the Sum of Natural Numbers using Recursion 


//Q.39-C Program to Calculate the Factorial of a Number Using


//Q.40-How to Return a Pointer from a Function in C


//Q.41-How to Declare a Two-Dimensional Array of Pointers in C?


//Q.42-C Program to Find the Largest Element in an Array using Pointers


//Q.43-C Program to Swap Two Numbers


//Q.44-C Program to Store Information of Students Using Structure


//Q.45-C Program to Store Student Records as Structures and Sort them by Name


//Q.46- C Program to Add N Distances Given in inch-feet System using Structures


//Q.47-C Program to Create a Temporary File


//Q.48-C Program to Read/Write Structure to a File


//Q.49-C Program to Rename a file


//Q.50-C Program to Make a File Read-Only


//Q.51-C program to Compare Two Files and Report Mismatches


//Q.52-C Program to Copy One File into Another File 



  return 0 ;
}
