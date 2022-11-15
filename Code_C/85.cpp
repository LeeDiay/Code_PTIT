#include <stdio.h>
#include <math.h> 
long long ktra(long long n)
{
	long long m,check=1;
	while (n>0)
	  {
	  	m=n%10;
	  	if (m==2 || m==3 || m==4 || m==5 || m==6 || m==7)
	  	  {
	  	  	check=0;
	  	  	break;
	  	  }
	  	n/=10;
	  }
	return check;
}
long long tach(long long n)
{
	long long a[20],cs,tong=0,t;
	long long m=n;
	cs=(long long)(log10(n)+1);
	for (long long i=1; i<=cs; i++)
	  {
	  	t=m%10;
	  	if (t==0 || t==8 || t==9)
	  	  a[i]=0;
	  	if (t==1)
	  	  a[i]=1;
	  	m/=10;
	  }
	for (int i=cs; i>=1; i--)
	  tong+=a[i]*pow(10,i-1);
	return tong;
}
int main()
{
	long long t,n,i;
	scanf("%lld", &t);
	for (i=1; i<=t; i++)
	  {
	  	 scanf("%lld", &n);
	  	 long long check=ktra(n);
	  	 if (check==0) printf("INVALID\n");
	  	 else 
	  	   {
	  	   	  long long dem=tach(n);
	  	   	  if (dem==0) printf("INVALID\n");
	  	   	  else
	  	   	  printf("%lld\n",dem);
	  	   	}
	  }
}
