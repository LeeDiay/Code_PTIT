#include<stdio.h> 
void nguyento(long long n)
{
	long long i,a[100000],dem=0;
	while (n%2==0) 
	  {
	  	a[dem]=2;
	  	dem++;
	  	n=n/2;
	  }
	i=3;
	while (n>1)
	  {
        if (n%i==0)
		  {
            a[dem]=i;
	  	    dem++;
            n=n/i;
          }
        else
            i=i+2;
      }
    for (int j=0; j<dem-1; j++)
       printf("%lldx", a[j]);
    printf("%lld", a[dem-1]);
}
int main()
{ 
	long long a,t,i; 
	scanf("%lld", &a); 
	nguyento(a);  
}   

