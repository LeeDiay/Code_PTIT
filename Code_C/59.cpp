#include <stdio.h>
#include <math.h>
int tn(long n)
{
  long m,dao=0;
  m=n;
  while (m>0)
   {
   	 dao=dao*10+m%10;
   	 m/=10;
   }
  if (dao==n) return 1;
  else return 0;
}

int snt(int a)
{
	int i,d=0;
	if (a<2) d=1;
    for (i=2; i<=sqrt(a); i++)
        if (a%i==0)
		  {
            d=1;
            break;
          }
    return d;
}

int main ()
{
	int o;
	scanf("%d",&o);
	for (int i=0; i<o;i++)
	{
	long a,b,dem=0;
	scanf("%ld%ld",&a,&b);
	for (long c=a;c<=b;c++)
	 {
	 	if (tn(c)==1 && snt(c)==0)
	 	{
	 		 printf("%ld ",c);
	 		 dem++;
		 }
	 	else continue;
	 	if (dem==10) {
	 		printf("\n");
	 		dem=0;}
	 	else continue;
	 }
	 printf("\n");
    }
}


