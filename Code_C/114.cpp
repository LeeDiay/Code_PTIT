#include<stdio.h>
int main()
{
	long long i,j,n,m,k,t,p;
	long long a[109][109], b[109][109], c[109][109] ;
	scanf("%lld", &t);
	for (p=1; p<=t; p++)
	  {
		scanf("%lld%lld", &n, &m);
		for (i=1; i<=n; i++)
	   	  for (j=1; j<=m;j++)
	        scanf("%lld", &a[i][j]);
	    printf("Test %lld:\n", p);
	    for (i = 2; i <= n; i++) 
	      {
            for (j= 2; j<=m; j++) 
               printf("%lld ", a[i][j]);
            printf("\n");
          }   
      }
}
