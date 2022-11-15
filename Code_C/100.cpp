#include<stdio.h>
int main()
{
	long long i,n,j,t;
	scanf("%lld", &n);
	long long a[105],mang[105];
	for (i=0; i<=103; i++)
	  mang[i]=0;
	for (i=0; i<n; i++)
	  {
	     scanf("%lld", &a[i]);
	     mang[a[i]]++;
	  }
	for (i=0; i<n; i++)
	  {
	  	t=a[i];
	  	if (mang[t]>0)
	  	  {
			    printf("%lld %lld\n",t, mang[t]);
			    mang[t]=0;
		  }
	  }
}
	    
