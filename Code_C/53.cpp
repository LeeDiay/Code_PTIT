#include<stdio.h>
#include<math.h>
int main()
{
	long long t,n,dem;
	scanf("%lld", &t);
	for (int i=1; i<=t ; i++)
	  {
	  	 scanf("%lld", &n);
	  	 dem=0;
	  	 while (n>0)
	  	   {
	  	   	  dem=dem+(n%10);
	  	   	  n=n/10;
	  	   	}
		 if (dem%10==0) printf("YES");
		 else printf("NO");
	     printf("\n");
	  }
}  

