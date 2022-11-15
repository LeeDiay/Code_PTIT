#include<stdio.h>
int main() 
{ 
	long long n,i;
	long long a[100];
	a[0]=6;
	a[1]=28;
	a[2]=496;
	a[3]=8128;
	a[4]=33550336;
	a[5]=8589869056;
	scanf("%lld", &n);
	for (int i=0; i<5; i++)
	  if (a[i]<n) printf("%lld ", a[i]);
	
}
