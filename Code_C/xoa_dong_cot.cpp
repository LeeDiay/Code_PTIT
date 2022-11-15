#include <stdio.h>
int main()
{
    long long i,j,n,m,tam;
    long long a[109][109];
    scanf("%lld%lld", &n, &m);
    for (i=0; i<n; i++)
        for (j = 0; j<m; j++)
            scanf("%lld", &a[i][j]);
    for(i=0; i<n; i++)
	  {  
        j=i;  
        tam = a[i][j];  
        a[i][j] = a[n][(n-j)-1];  
        a[n][(n-j)-1] = tam;  
      }  
    for (i=0; i<n; i++)
	   {
	      for (j=0; j<m;j++)
	         printf("%lld ",a[i][j]);
	      printf("\n");
   	   }
}
