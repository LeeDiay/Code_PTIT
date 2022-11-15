#include<stdio.h>
int main()
{
    long long i,j,n,tam;
    scanf("%lld", &n);
    long long a[n];
    for (i=0; i<n; i++)
    	scanf("%lld", &a[i]);
    for (i=0; i<n; i++)
		for (j=i+1; j<n; j++)
        	if (a[i] > a[j])
          	   { 
          	   	  tam = a[i];
                  a[i] = a[j];
                  a[j] = tam;	
			   }
    for (i=0; i<n; i++)
        printf("%lld ", a[i]);
}

