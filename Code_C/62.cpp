#include<stdio.h> 
int gt(int n)
{
    int k=1;
	if (n==0) k=1;
	else
	 {
	 	for (int i=1;i<=n;i++) k*=i;
	 }
	return k;
}
int strong(long a)
{
	long long b,m,s=0;
	b=a;
	while (a>=1)
	 {
	 	m=a%10;
	 	s+= gt(m);
	 	a/=10;
	 }
	if (s==b) return 1;
	else return 0;
}
int main()
{
	long long k;
	scanf("%lld",&k);
	for (long long c=1;c<=k;c++)
	 {
	 	if (strong(c)==1)
	 	{
	 		printf("%lld ",c);
		 }
	 }
}



