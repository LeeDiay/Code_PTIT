#include<stdio.h>
void chayct(long long n)
{
    int mang[20]={0};
    int i,k;
    while (n!=0)
       {
           k=n%10;
           n=(long long) n/10;
           if (k==2 || k==3 || k==5 || k==7)
              mang[k]++;
       }
    for(i=1; i<10; i++)
      if (mang[i]!=0)
        printf("%d %d \n",i, mang[i]);
}
int main ()
{
    long long n;
    scanf("%lld",&n);
    chayct(n);
}
