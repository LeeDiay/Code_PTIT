#include <stdio.h>
int main ()
{
	long long  a,n,b;
	scanf("%lld",&a);
	for ( b=1; b<=a;b++)
	 {
	 	scanf("%lld",&n);
	 	printf("%lld = ",n);
	 	long long  dem=0;
	 	for (long long c=2;c<=n;c++ )
	 	 {
	 	 	long long  dem=0;
			if (n%c==0)
			 {
			 while(n%c==0)
				{
					dem++;
					n=n/c;
				} 
			 } 
			 else continue;  	 
             printf("%lld^%lld",c,dem);
			 if (n>c) printf(" * "); 
		       }
	 	    printf("\n");
			}		  
}


