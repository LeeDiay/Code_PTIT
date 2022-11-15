#include <stdio.h>
#include <math.h>
int ntcn(long long a,long long b)
{
    long long r;
    while(b)
        r = a % b, a = b, b = r;
    return (a == 1);
}

int main()
{
	long long a,b;
	scanf("%lld%lld",&a,&b);
	for (long long i=a;i<=b;i++)
	 {
	 	for (long long j=a;j<=b;j++)
	 	 {
	 	 	if (i==j) continue; 
			  if (ntcn(i,j)==1)
	 	 	 {
	 	 	 	if (j>i)printf("(%lld,%lld)\n",i,j);
	 	 	 	else continue;
			   }
		  }
	 }
}
