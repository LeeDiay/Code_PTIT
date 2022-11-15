#include<stdio.h> 
int tn(long long n)
{
  long long  m,dao=0;
  m=n;
  while (m!=0)
   {
   	 dao=dao*10+m%10;
   	 m=(long long )m/10;
   }
  if (dao==n) return 1;
  else return 0;
}
int main()
{ 
 int a,i;
long long n,m,s,check;
 scanf("%d",&a);
 for(i=0; i<a; i++)
   {
  	scanf("%lld",&n);
    s=0;
    check=1;
  	if (tn(n)==1)
       	{
          while (n!=0)
  	        {
  	 	        m=n%10;
  	 	        s=s+m;
              n=(long long ) n/10;
  	 	        if (m%2==0)
  	 	          {
  	 	 	          check=0;
  	 	 	          break;
			          }
  	        }
          if (s%2==1 && check==1) 
            printf("YES\n");
          else 
           printf("NO\n");
	       }
   	else 
      printf("NO\n");
      }
}
