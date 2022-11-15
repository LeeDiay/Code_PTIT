#include<stdio.h>
int main()
{
	long long i,j,n,m,k,h,tam;
	long long a[100][100];
	scanf("%lld%lld", &n, &m);
	for (i=1; i<=n; i++)
	   for (j=1;j<=m;j++)
	      scanf("%lld",&a[i][j]);
	scanf("%lld%lld", &k, &h);
	for (j=1; j<=m; j++)
	  {
	  	tam=a[k][j];
	  	a[k][j]=a[h][j];
	  	a[h][j]=tam;
	  }
	for (i=1; i<=n; i++)
	  {
	    for (j=1;j<=m;j++) 
	       printf("%lld ", a[i][j]);
	    printf("\n");
      }
}
	       
	      
	
