#include<stdio.h>
int main()
{
	long long i,j,n,m,r,c,tam;
	long long a[109][109];
	scanf("%lld%lld%lld%lld", &n, &m, &r, &c);
	for (i=1; i<=n; i++)
	   for (j=1; j<=m;j++)
	      scanf("%lld", &a[i][j]);
	for (i=r; i<=n-1; i++)
        for (j=1; j<=m; j++)
            a[i][j]=a[i+1][j];
    n=n-1;
    for ( i=1; i<=n; i++)
        for (j=c; j<=m-1; j++)
            a[i][j]=a[i][j+1];
    m=m-1;
    for (i=1; i<=n; i++)
	   {
	      for (j=1; j<=m;j++)
	         printf("%lld ",a[i][j]);
	      printf("\n");
   	   }
}
