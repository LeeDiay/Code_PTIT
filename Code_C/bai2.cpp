#include<stdio.h>
int main()
{
	long long i,j,n,m,k,p,q;
	scanf("%lld%lld%lld%lld", &m, &n, &p, &q);
	long long a[200][200], b[200][200], c[200][200], d[200][200], e[200][200] ;
	for (i=1; i<=m; i++)
	   for (j=1; j<=n;j++)
	      scanf("%lld", &a[i][j]);
	for (i=1; i<=n; i++)
	   for (j=1; j<=p; j++)
	      scanf("%lld", &b[i][j]);
	for (i=1; i<=p; i++)
	   for (j=1; j<=q; j++)
	      scanf("%lld", &c[i][j]);
	for(i=1; i<=m; i++)
        {
		  for(j=1; j<=p; j++)
            {
                d[i][j]=0;
                for (k=1; k<=n; k++)
                    d[i][j]=d[i][j]+(a[i][k]*b[k][j]);
            }
        }
    for(i=1; i<=m; i++)
        {
		  for(j=1; j<=q; j++)
            {
                e[i][j]=0;
                for (k=1; k<=p; k++)
                    e[i][j]=e[i][j]+(d[i][k]*c[k][j]);
            }
        }
    for (i = 1; i <= m; i++) 
	   {
          for (j = 1; j<=p; j++) 
             printf("%lld ", e[i][j]);
          printf("\n");
       }   
}
