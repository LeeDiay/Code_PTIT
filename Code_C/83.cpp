#include<stdio.h>
#include<math.h>
int check(int xa, int ya, int xb, int yb, int xc, int yc)
{
	if ((xa-xb)*(yb-yc)==(xb-xc)*(ya-yb))
	   return 1;
	else return 0;
}
int main()
{
	int n,d=0;
	scanf("%d", &n);
	int x[100005], y[100005];
	for (int i=0; i<n-1; i++)
	  scanf("%d %d", &x[i], &y[i]);
	for (int i=0; i<n-3; i++)
	  {
	  	 if (check(x[i], y[i], x[i+1], y[i+1], x[i+2], y[i+2])==0)
	  	   {
	  	   	  d=1;
	  	   	  break;
	  	   }
       }
    if (d==0) printf("Yes");
    else printf("No");
}
	  	  	
	
