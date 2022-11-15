#include<stdio.h>
#include<math.h>
int main()
{
	long long t,n,dem, a[100],check;
	scanf("%lld", &t);
	for (int i=1; i<=t ; i++)
	  {
	  	 scanf("%lld", &n);
	  	 dem=0;
	  	 check=0;
	  	 while (n>0)
	  	   {
	  	   	  a[dem]=n%10;
	  	   	  dem++;
	  	   	  n=n/10;
	  	   	}
		 for (int j=0; j<dem-1; j++)
		   if (a[j]<a[j+1])
	          {
	          	check=1;
	          	break;
	          }
	      if (check==0) printf("YES"); 
	      else printf("NO");
	      printf("\n");
	  }
}  

