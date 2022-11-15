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
	long long a,b,c;
	scanf("%lld%lld", &a, &b);
	c=ucln(a,b);
	printf("%lld\n%lld", c, a*b/c);
}  

