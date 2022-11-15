#include <stdio.h>
#include <math.h>
#include <stdbool.h>

bool check(int n)
{
    int tong=0, dao=0, a=n;
    while (a > 0)
     {
        dao=dao*10+a%10;
        tong+=dao%10;
        a/=10;
     }
    if (tong%10 != 0)
        return 0;
    if (dao != n)
        return 0;
    return 1;
}

void john()
{
    int n;
    scanf("%d", &n);
    int dem=0;
    int d = pow(10,n-1);
    int c = pow(10,n)-1;
    for (long long i=d; i<=c; i++)
        if (check(i))
            dem++;
    printf("%d\n", dem);
}

int main()
{
    int t;
    scanf("%d", &t);
    while (t--)
        john();
}
