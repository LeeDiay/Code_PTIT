#include<stdio.h>
int main()
{
   long long i,n, m,p,t;
   scanf("%lld", &t);
   for (int j=1; j<=t; j++)
     {
   		scanf("%lld%lld%lld", &n, &m, &p);
   		long long a[n+5], b[m+5];
   		for(i=0; i<n; i++)
      		scanf("%lld",&a[i]);
   		for(i=0; i<m; i++)
      		scanf("%lld",&b[i]);
      	printf("Test %lld:\n",j);
  		for(i=0; i<p; i++)
      		printf("%lld ", a[i]);
   		for (i=0; i<m; i++)
     		printf("%lld ", b[i]);
    	for (i=p; i<n; i++)
      		printf("%lld ", a[i]);
      	printf("\n");
      }
}

