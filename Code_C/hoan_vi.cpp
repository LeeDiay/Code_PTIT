#include<stdio.h>
int main()
{
	long long n,i,j,tam;
	long long a[100][100];
	scanf("%lld", &n);
	for (i = 0; i < n; i++)
		for (j = 0; j < n; j++)
			scanf("%lld", &a[i][j]);
	for (i = 0; i < n; i++)
	  {
	    tam = a[i][i];
		a[i][i] = a[i][n-i-1];
		a[i][n-i-1] = tam;
      }
	for (i = 0; i < n; i++)
	  {
		for (j = 0; j < n; j++)
			printf("%lld ", a[i][j]);
		printf("\n");
	  }
}
