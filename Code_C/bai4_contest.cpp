#include <stdio.h>
#include <math.h>
long long tach(long long n)
{
	long long a[20],cs,tong=0;
	long long m=n;
	cs=(long long)(log10(n)+1);
	for (int i=1; i<=cs; i++)
	  {
	  	a[i]=m%10;
	  	m/=10;
	  }
	for (int i=cs-1; i>=2; i--)
	  tong+=a[i]*pow(10,i-2);
	return tong;
}
int main()
{
	long long i,n,t;
	scanf("%lld", &t);
	i=tach(t);
	printf("%lld",i);
}
