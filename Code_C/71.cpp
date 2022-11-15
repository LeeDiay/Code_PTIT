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
	long long a,b,c,d,hihi, hehe,t,i;
	scanf("%lld", &t);
	for (i=1; i<=t; i++)
	  {
		scanf("%lld%lld%lld%lld", &a, &b, &c, &d);
		hihi=ucln(a,b);
		hehe=ucln(c,d);
		if (hihi==hehe) printf("YES");
		else printf("NO");
		printf("\n");
}     }

