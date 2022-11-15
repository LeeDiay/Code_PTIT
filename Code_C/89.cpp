#include<stdio.h>
long long Kt(long long a[], long long n)
{
	for(int i = 0; i < n/2; i++)
	{
		if(a[i] != a[n - i - 1])
		{
			return -1;
			break;
		}
	}
	return 1;
}
int main()
{
	long long t,i;
	scanf("%lld", &t);
	for (i=1; i<=t; i++)
	  {
	  	long long n,j, a[200];
	  	scanf("%lld", &n);
	  	for (j=0; j<n; j++)
	  	  scanf("%lld", &a[j]);
	  	long long d=Kt(a,n);
	  	if (d==1) printf("YES");
	  	else printf("NO");
	  	printf("\n");
	  }
}

