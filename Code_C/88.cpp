#include<stdio.h>
#include<math.h>
long long snt(long long n)
{	
	long long i,d=0;
	if (n<2) d=1;
    for (i=2; i<=sqrt(n); i++)
        if (n%i==0)
		  {
            d=1;
            break;
          }
    return d;
}
int main() 
{ 
    long long a,b,i,mang[10000],dem,tong,t,j;
    scanf("%lld", &t);
    for (j=1; j<=t; j++)
      {
    	scanf("%lld",&a);
    	for (i=1; i<=a; i++)
      	  {
      	  	scanf("%lld", &mang[i]);
     	    if (snt(mang[i])==0) 
     	       printf("%lld ",mang[i]);
	      }
	     printf("\n");
	  }
}
