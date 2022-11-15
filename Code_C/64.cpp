#include<stdio.h>
int main() 
{ 
	long long n,d=0;
	long long i;
	scanf("%lld", &n);
	long long a[n];
	a[0]=0;
	a[1]=1;
	for ( i=2; i<n; i++)
	 {
	  a[i]=a[i-1]+a[i-2];
	   if (n==a[i])
	     {
	     	d=1;
	     	break;
	      }
	 }
	if (d==0) printf("0"); 
	else printf("1");
}
