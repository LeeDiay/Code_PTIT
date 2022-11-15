#include <stdio.h>
int main ()
{
	long long  a,i,b[100000],tong=0;
	scanf("%lld",&a); 
	for (i=1; i<=a; i++)
	  {
	    scanf("%lld", &b[i]);
	    tong+=b[i];
	  }
	printf("%.3lf", (double)tong/a);
		 
}
