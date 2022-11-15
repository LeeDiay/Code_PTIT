#include<stdio.h>
int main()
{
    long long i,j,n,x,dem=0	;
    scanf("%lld", &n);
    long long a[130]={0};
    for (i=0;i<n;i++)
        {
        	scanf("%lld",&x);
            a[x]=a[x]+1;
        }
    for (i=0;i<130;i++)
      if (a[i]!=0) dem++;
    printf("%lld ", dem);
}
