#include<stdio.h>
int main() 
{
  long long n,i,j;
  scanf("%lld", &n);
  long long a[100][100];
  for (i = 0; i < n; i++)
    for (j = 0; j < n; j++) 
      scanf("%lld", &a[i][j]);
  for (i=n-1; i>=0; i--) 
     {
        for (j = 0; j<n; j++) 
           printf("%lld ", a[j][i]);
        printf("\n");
     }
}
