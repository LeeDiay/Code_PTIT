#include<stdio.h>
int main()
{
	long long i,n,j,t,k,check;
	scanf("%lld", &t);
	long long a[105];
	for (i=0; i<t; i++)
	  {
	  	long long dem=0;
	  	scanf("%lld", &n);
		for (j=1; j<=n; j++)
		  scanf("%lld", &a[j]);
		for (j=2; j<=n; j++)
		  {
		    for (k=j-1; k>=1; k--)
		      {
		    	check=0;
			     if (a[j]<a[k])
			       {
			       	  check=1;
			          break;
			       }
			  }
			if (check==0) dem++;
		    
	      }
		printf("%lld\n", dem+1);
	  } 
	 
}
	    
