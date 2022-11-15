#include<stdio.h>
int main()
{
	long long i,n,j,dem=0;
	scanf("%lld", &n);
	long long a[105],mang[105];
	for (i=1; i<=103; i++)
	  mang[i]=0;
	for (i=1; i<=n; i++)
	  {
	     scanf("%lld", &a[i]);
	     mang[a[i]]++;
	  }
	for (i=1; i<=n; i++)
	  {
	  	long long t=a[i];
	  	if (mang[t]==1)
			dem++;
	  }
	printf("%lld\n", dem);
	for (i=1; i<=n; i++)
	 {
	  	long long t=a[i];
	  	if (mang[t]==1)
			printf("%lld ",t);
	  }
}
	    
