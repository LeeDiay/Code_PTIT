#include <stdio.h>

void hihi()
{
	long long n;
    scanf("%lld", &n);
    long long a[100001];
    for (int i=0; i<n; i++)
        scanf("%lld", &a[i]);
    int check=0;
    for (int i=0; i<n-1; i++)
     {
        for (int j=i+1; j<n; j++)
            if (a[j] == a[i])
             {
                printf("%lld\n", a[i]);
                check=1;
                break;
             }
        if (check!=0)
            break;
     }
    if (check==0)
        printf("NO\n");
}

int main()
{
    long long t;
    scanf("%lld", &t);
    while (t--)
        hihi();
}
