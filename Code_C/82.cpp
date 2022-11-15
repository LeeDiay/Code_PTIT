#include<stdio.h>
#include<math.h>
int main()
{ 
	long long a, d, t, i, n,j, test;
	scanf("%lld", &test);
	for (i=1; i<=test; i++)
	  {
		scanf("%lld", &a);
		if (a%2!=0)
		  {
		  	long long chan=0, le=0;
   	    	while (a > 0)
     	      {
        		t=a%10;
            	d=t;
            	if (d%2==0) chan++;
            	else le++;
            	a=a/10;
          	  }
          	if (chan<le) printf("YES");
          	else printf("NO");
          }
        else printf("NO");   
        printf("\n");
      }
}


