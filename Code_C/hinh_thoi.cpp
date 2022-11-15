#include<stdio.h>
int main()
{
    long long n,j,i,t;
    scanf("%lld",&n);
    t=n-1;
    for (i=1; i<=n; i++)
     {
        for (j=1; j<=t; j++)
        printf("~");
        t--;
        for (j=1; j<=2*i-1; j++)
        printf("*");
        printf("\n");
     }
    t=1;
    for ( i=1; i<=n-1; i++)
     {
        for (j=1; j<=t; j++)
        printf("~");
        t++;
        for (j=1; j<=2*(n-i)-1; j++)
        printf("*");
        printf("\n");
     }
}    
