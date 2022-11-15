#include<stdio.h>
int main() 
{ 
	long long ai,b,min,max,i;
	long long a[100];
	a[0]=6;
	a[1]=28;
	a[2]=496;
	a[3]=8128;
	a[4]=33550336;
	a[5]=8589869056;
	scanf("%lld%lld", &ai, &b);
	min=ai;
	if (b<min) min=b;
	max=ai+b-min;
	for (int i=0; i<5; i++)
	  if (a[i]>=min && a[i]<=max) printf("%lld ", a[i]);
}
