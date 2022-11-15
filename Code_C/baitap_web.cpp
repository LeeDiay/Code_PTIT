#include<stdio.h>
int main()
{
    long long i,n,j,t;
    double tong=0,tam,a[100000];
    scanf("%lld", &t);
    a[1]=1;
    for (i=2; i<1000000; i++)
      a[i]=a[i-1]+(double)1/i;
    for (j=1; j<=t; j++)
    {
        scanf("%lld", &n);
        printf("%.5lf",a[n]);
        printf("\n");
    }
    
}
