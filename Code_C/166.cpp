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
	for (i=1; i<=n; i++)
	  {
	  	tam=a[i][k];
	  	a[i][k]=a[i][h];
	  	a[i][h]=tam;
	  }
	for (i=1; i<=n; i++)
	  {
	    for (j=1;j<=m;j++) 
	       printf("%lld ", a[i][j]);
	    printf("\n");
      }
}
	       
	      
	

