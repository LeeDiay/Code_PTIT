#include<stdio.h>

void sap_xep(long long a[], long long n)
{
	long long i, j, tam;
	for (i=0; i<n; i++)
		for (j=i+1; j<n; j++)
        	if (a[i] > a[j])
          	{ 
          	   	  tam = a[i];
                  a[i] = a[j];
                  a[j] = tam;	
			}
}

long long tim_kiem_nhi_phan(long long a[], long long n, long long x)
{
	long long left = 0, right = n-1;
	long long mid;
	while (left <= right)
	{
	    mid = (left + right) / 2;
		if (a[mid] == x) return mid;
		if (x > a[mid]) left =  mid + 1;
		else right = mid - 1;
	}
}
	
int main()
{
    long long i, j, n, tam, x;	
    scanf("%lld", &n);
    long long a[n];
    for (i=0; i<n; i++)
    	scanf("%lld", &a[i]);
    printf("Day da nhap la :\n");
    for (i=0; i<n; i++)
        printf("%lld ", a[i]);
    sap_xep(a,n);
    printf("\nDay sau khi sap xep tang dan la :\n");
    for (i=0; i<n; i++)
        printf("%lld ", a[i]);
    printf("\nNhap gia tri can tim kiem: ");
    scanf("%lld", &x);
    int vitri = tim_kiem_nhi_phan(a,n,x);
    printf("So can tim o vi tri: %d", vitri+1);
}

