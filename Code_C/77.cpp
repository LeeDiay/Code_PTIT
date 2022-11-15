#include<stdio.h>
#include<math.h>
int tinhtongcs(long long n)
{
    int tong;
    tong=0;
    while (n!=0)
    {
       tong=tong+n%10;
       n=(int) n/10;
    }
    return tong;
    
}
int  kiemtrant(long long n)
{
    long long i;
    if (n==1)
       return 0;
    else 
      {
          if (n==2 || n==3)
            return 1;
          else
            {
                for ( i=2; i<=(long long) sqrt(n);i++)
                  {
                    if (n%i==0)
                      return 0; 
                   }
            }
      }
    return 1;
}
void chayct(long long n)
{
    long long i,dem,n1;
    dem=0;
    n1=n;
    long long a[100];
    if (kiemtrant(n)==1)
       {
           dem=dem+1;
           a[dem]=n;
       }
    else
       {
           i=2;
           while(i<=n)
              {
                  if (kiemtrant(i)==1)
                     {
                         while (n%i==0)
                           {
                               dem=dem+1;
                               a[dem]=i;
                               n=(long long) n/i;
                           }
                        if (kiemtrant(n)==1)
                        {
                            dem=dem+1;
                            a[dem]=n;
                            break;
                        }
                
                     }
                  i=i+1;
              }
       }
    long long tong;
    tong=0;
    for(i=1;i<=dem; i++)
       tong=tong+tinhtongcs(a[i]);
   // printf("%d",tong);
   // printf("%d",tinhtongcs(n1));
    if (tong==tinhtongcs(n1))
      printf("YES");
    else
       printf("NO");

}
int main ()
{
    long long n;
    scanf("%lld",&n);
    chayct(n);
}
