#include <stdio.h>
#include <math.h>
#include <stdbool.h>

bool tinhtongcs(long long n)
{
    int s=0;
    while (n>0)
     {
        s+=n%10;
        n/=10;
     }
    if (s%5==0)
        return 1;
    else
        return 0;
}

bool checknt(int n)
{
    if (n<=1)
        return 0;
    for (int i=2; i<=sqrt(n); i++)
        if (n%i==0)
            return 0;
    return 1;
}

int main()
{
    long long n;
    scanf("%lld", &n);
    long long dem=0;
    for (int i=1; i<=n; i++)
        if (tinhtongcs(i)==1 && checknt(i)==1)
        {
            printf("%d ", i);
            dem++;
        }
    printf("\n%lld", dem);
}
