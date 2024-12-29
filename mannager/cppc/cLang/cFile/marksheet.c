#include<stdio.h>

int main()
{
char name [30];
int h,e,m,p,c;
float per ,t ;

printf("Enter Your Name : ");
 scanf("%s",&name);
    printf("\nMarks of. Hindi :");
    scanf("%d",&h);
    printf("\nMarks of. English : ");
    scanf("%d",&e);
    printf("\nruMarks of Physics:.");
    scanf("%d",&p);
    printf("\nMarks of. Chemistry:");
    scanf("%d",&c);
    printf("\nMarks of. maths :");
    scanf("%d",&m);
     t = h+e+p+c+m;
     per = t/5;
     printf("persentage : %f % \n",per);
     printf("Result: ");
     if(h>=33 && e >= 33 &&  m >= 33 &&  p >= 33 && c >= 33){
     printf("pass\n");
     }
     else{
     printf("fail");
    }
    if (per >=90){
    printf("Grade : A+ ");
    }
    else if(per >=75 &&  per< 90){
    printf("Grade : A ");
    }
    else if(per >= 60 && per < 75) {
    printf("Grade : B ");
    }
    else if (per >= 45 && per < 60){
        printf("Grade : C ");
        
    }
    else if (per >= 33 && per < 45){
        printf("Grade : D ");
        
    }
    else if (per >= 20 && per < 33){
        printf("Grade : E");
        
    }
    else if (per >= 0 && per < 20){
        printf("Grade : F");
        
    }
    
    return 0;
}