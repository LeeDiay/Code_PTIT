#include <stdio.h>
int main ()
{
	long long  a,n,b;
	scanf("%lld",&a);
	for ( b=1; b<=a;b++)
	 {
	 	scanf("%lld",&n);
	 	printf("Test %lld: ",b);
	 	long long  dem=0;
	 	for (long long c=2;c<=n;c++ )
	 	 {
			if (n%c==0)
			 {
			 while(n%c==0)
				{
					dem++;
					n=n/c;
				} 
			 } 
			 else continue;  	 
             printf("%lld(%lld) ",c,dem);
			 dem=0;  
		       }
	 	    printf("\n");
			}		  
}

