#include<stdio.h>
int main()
{
	long long a,t,d;
	scanf("%lld", &t);
	for (int i=1; i<=t; i++)
	  {
	  	long long check=0;
	  	scanf("%lld", &a);
	  	while (a>0)
	  	  {
	  	  	d=a%10;
	  	  	if (d%2!=0)
	  	  	  {
	  	  	  	check=1;
	  	  	  	break;
	  	  	  }
	  	  	a/=10;
	  	  }
	  	if (check==0) printf("YES");
	  	else printf("NO");
	  	printf("\n");
	  }
}
	  	
