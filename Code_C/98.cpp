#include<stdio.h>
int main()
{
	long long i,n,j;
	scanf("%lld", &n);
	long long a[105],mang[105];
	for (i=1; i<=103; i++)
	  mang[i]=0;
	for (i=1; i<=n; i++)
	  {
	     scanf("%lld", &a[i]);
	     mang[a[i]]++;
	  }
	long long check=0;
	for (i=1; i<=n; i++)
	  for (j=i+1; j<=n; j++)
	    if (a[i]==a[j])
	      {
	      	check=1;
	      	break;
	      }
	if (check==0) printf("0");
	else 
	  {
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
	
}
	    
