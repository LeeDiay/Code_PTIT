#include<stdio.h>
int main() 
{ 
	long long n,t;
	long long a[100];
	a[0]=1;
	a[1]=1;
	for (int i=2; i<100; i++)
	  	  a[i]=a[i-1]+a[i-2];
	scanf("%lld", &t);
	for (int j=1; j<=t; j++)
	  {
		scanf("%lld", &n);
	    printf("%lld ", a[n-1]);
	    printf("\n");	
	  }
}
