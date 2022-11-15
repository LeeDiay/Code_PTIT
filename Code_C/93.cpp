#include<stdio.h>
int main()
{
   long long i,n, m,k;
   scanf("%lld%lld", &n, &m);
   long long a[n+5], b[m+5];
   for(i=0; i<n; i++)
      scanf("%lld",&a[i]);
   for(i=0; i<m; i++)
      scanf("%lld",&b[i]);
    scanf("%lld", &k);
   for(i=0; i<k; i++)
      printf("%lld ", a[i]);
   for (i=0; i<m; i++)
     printf("%lld ", b[i]);
    for (i=k; i<n; i++)
      printf("%lld ", a[i]);
}

