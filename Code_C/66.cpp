#include<stdio.h>	
int ucln(int a, int b )
{
    int r = a % b;       
    while ( r!=0) 
	{      
        a = b;  
        b = r;
        r = a % b;   
    }
    return b;
}
int main()
{
	long long a,b,c,t,i;
	scanf("%lld", &t);
	for (i=1; i<=t; i++)
	  {
		scanf("%lld%lld", &a, &b);
		c=ucln(a,b);
		printf("%lld %lld\n", a*b/c, c);
	  }	
}  

