#include<stdio.h>
int main()
{
	long long a,b,s1=0, s2=0;
	scanf("%lld %lld9", &a, &b);
	long long t=a;
	long long d=b;
	while (a>0)
	  {
	  	s1+=a%10;
	  	a/=10;
	  }
	while (b>0)
	  {
	  	s2+=b%10;
	  	b/=10;
	  }
	if (s1>s2) printf("%lld %lld",d,t);
	if (s2>=s1) printf("%lld %lld", t,d);
}
	
