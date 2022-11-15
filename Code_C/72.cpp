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
long long tach(long long n)
{
	long long hihi,c=1;
	while (n>0)
	  {
	  	hihi=n%10;
	  	if (snt(hihi)==1) 
		  {
		  	c=0;
		  	break;
		  }
	  	n/=10;
	  }
	return c;
}
int main() 
{ 
    long long n,a,b,i,mang[10000],dem,tong,t,j;
    scanf("%lld", &t);
    for (j=1; j<=t; j++)
      {
    	scanf("%lld%lld",&a, &b);
    	dem=0;
    	tong=0;
    	for (i=a; i<=b; i++)
      	  {
     	     if (snt(i)==0) 
     	        {
     	  	       mang[dem]=i;
     	  	       dem++;
     	        }
	      }
	    for (i=0; i<dem; i++)
	    if (tach(mang[i])==1) 
	       tong++;
	    printf("%lld", tong);
	    printf("\n");
	 }
}


