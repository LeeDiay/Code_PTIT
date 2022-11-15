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
    long long n,a,b,i,mang[10000],dem,tong,t,j;
    scanf("%lld", &t);
    for (j=1; j<=t; j++)
      {
    	scanf("%lld",&a);
    	dem=0;
    	tong=0;
    	for (i=2; i<=10000; i++)
      	  {
     	     if (snt(i)==0) 
     	        {
     	  	       mang[dem]=i;
     	  	       dem++;
     	        }
	      }
	    for (i=0; i<dem; i++)
	      for (int k=i; k<dem; k++)
	         if (mang[i]+mang[k]==a) printf("%lld %lld ",mang[i], mang[k]);
	    printf("\n");
	 }
}


