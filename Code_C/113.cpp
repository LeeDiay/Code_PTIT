#include<stdio.h>
int main()
{
	long long i,j,n,m,k,t,p;
	long long a[109][109], b[109][109];
	scanf("%lld%lld", &n, &m);
	for (i=1; i<=n; i++)
	   	for (j=1; j<=m;j++)
	        scanf("%lld", &a[i][j]);
	for (i=1; i <= m; i++) 
        for (j=1; j<=n; j++) 
            b[i][j]=a[j][i];      
    for (i=1; i<=m; i++)
	   {
	   	  for (j=1; j<=n; j++)
	   	    printf("%lld ", b[i][j]);
	   	  printf("\n");
	   	}
}
