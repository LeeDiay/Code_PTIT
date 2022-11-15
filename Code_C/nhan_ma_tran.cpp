#include<stdio.h>
int main()
{
	long long i,j,n,m,k;
	long long a[109][109], b[109][109], c[109][109] ;
	scanf("%lld%lld", &n, &m);
	for (i=1; i<=n; i++)
	   for (j=1; j<=m;j++)
	      scanf("%lld", &a[i][j]);
	for (i=1; i<=m; i++)
	   for (j=1; j<=n;j++)
	      scanf("%lld", &b[i][j]);
	for(i=1; i<=n; i++)
        {
		  for(j=1; j<=n; j++)
            {
                c[i][j]=0;
                for (k=1; k<=m; k++)
                    c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
            }
        }
    for (i = 1; i <= n; i++) 
	   {
          for (j = 1; j<=n; j++) 
             printf("%lld ", c[i][j]);
          printf("\n");
       }   
}
