#include <stdio.h>
#include <math.h> 
long long ktrand(long long n)
{
    long m,dao=0;
    m=n;
    while (m>0)
     {
   	    dao=dao*10+m%10;
   	    m/=10;
     }
    if (dao==n) return 1;
    else return 0;
}
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
long long ktradc(long long n)
{
	long long c,d,check=0;
	c=n%10;
	while (n>0)
	  {
	  	d=n%10;
	  	n/=10;
	  }
	if (d==2*c || c==d*2) check=1;
	return check;
}
int main()
{
	long long i,n,t;
	scanf("%lld", &t);
	for (i=1; i<=t; i++)
	  {
	  	scanf("%lld", &n);
	  	long long d=tach(n);
	  	if (ktradc(n)==1 && ktrand(d)==1) printf("YES");
	  	else printf("NO");
	  	printf("\n");
	  }
}
	  	

