#include<stdio.h>
#include<math.h>
int check(int n)
{
	int c=n%10;
	n/=10;
	while (n!=0)
	  {
	  	 int b=n%10;
	  	 if (b>c) return 0;
	  	 c=b;
	  	 n/=10;
	  }
	return 1;
}
int main()
{
	int t;
	scanf("%d", &t);
	while (t--)
	  {
	  	int n;
	  	scanf("%d", &n);
	  	int a=pow(10,n-1), b=pow(10,n);
	  	for (int i=a; i<b; i++)
	  	  	if (check(i)==1) printf("%d ", i);
	  	printf("\n");
	  }
}
	  	  	
	
