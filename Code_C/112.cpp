#include<stdio.h>
int main()
{
	long long i,n,j,dem=0;
	scanf("%lld", &n);
	long long a[105],mang[105],mang1[105];
	for (i=1; i<=103; i++)
	  {
	     mang[i]=0;
	     mang1[i]=0;
	  }
	for (i=1; i<=n; i++)
	  {
	     scanf("%lld", &a[i]);
	     mang[a[i]]++;
	     mang1[a[i]]++;
	  }
	for (i=1; i<=n; i++)
	  if (mang1[a[i]]>1)
	  	      {
			    dem++;
			    mang1[a[i]]=0;
			  }
	printf("%lld\n", dem);
	for (i=1; i<=n; i++)
	  	{
	  	  long long t=a[i];
	  	  if (mang[t]>1)
	  	    {
			    printf("%lld ",t);
			    mang[t]=0;
			}
	  	}
}
	    

