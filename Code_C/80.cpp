#include<stdio.h>
#include <math.h> 
int tn(long long n)
{
    long long m,dao=0;
    m=n;
    while (m>0)
      {
   	     dao=dao*10+m%10;
   	     m/=10;
      }
    if (dao==n) return 1;
    else return 0;
}
int main()
{ 
    int n,t;
    scanf("%d",&t);
    for (int k=0; k<t; k++)
     {
       scanf("%d",&n);
       long long dau=pow(10,n-1), duoi=pow(10,n);
	   for (long long i=dau; i<duoi;i++)
	     {
	        long long p=i,dem=0;
	        int d=1;
		    if(tn(p)==1)
	 	      {
	 	 	     while (p)
	 	 	       {
				      int m=p%10;
	 	 	 	      if (m==4) 
				        {
				           d=0;
					       break;  	
				        }
				      dem+=p;
				      p/=10;
			        } 
	          }
	    else d=0;
        if (d==1 && dem%10==0) printf("%lld ",i);
	     }
	    printf("\n");
     }
}

