#include<stdio.h>
int main()
{
	long long i,j,n;
	scanf("%lld", &n);
	long long a[n][n];
	for (i=0; i<n; i++)
      for (j=0;j<n;j++)
	    scanf("%lld",&a[i][j]);
	for (i=0; i<n; i++)
      {for (j=0;j<n;j++)
       {
          if (i==0||i==n-1||j==0||j==n-1)
             printf("%lld",a[i][j]);
         else
             printf(" ");
      }
      printf("\n");}
}
	
