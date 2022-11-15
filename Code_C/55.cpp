#include <stdio.h>
#include <math.h>
int johndeptrai(int a)
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
int main()
{
    int n,t, c=0;
    scanf("%d", &n);
    for (int i=2;c<n;i++)
	  {
         if (johndeptrai(i)==0)
		   {
             printf("%d\n", i);
             c++;
           }
      }
}

