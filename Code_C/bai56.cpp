#include<stdio.h>
int main()
{
  long long i,j,n,m,c,dem=0,tam;
  long long a[109][109], b[109];
  scanf("%lld%lld%lld", &n, &m, &c);
  for (i=1; i<=m; i++) 
    scanf("%lld", &b[i]);
  for (i=1; i<=n; i++)
     for (j = 1; j<=m; j++) 
      scanf("%lld", &a[i][j]);
  for (i=1; i<=n; i++) 
       {
           tam=0;
           for (j=1; j<=m; j++) 
               tam = tam + a[i][j] * b[j];
           if (tam+c>0) dem++;
       }
  printf("%lld", dem);
}
