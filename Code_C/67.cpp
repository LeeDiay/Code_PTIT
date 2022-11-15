#include<stdio.h> 
#include<math.h>
int nt(int n)
{ 
	if (n<2 ) return 0; 
	for (int i=2; i<=sqrt(n); i++)
	  { 
	    if (n%i==0) return 0; 
	  } return 1; 
} 
int tong(int n)
{ 
	int sum=0; 
	while(n)
	  { 
	    sum=sum+n%10; 
		n=n/10; 
	  } 
	return sum; 
} 
long long fabo( int n)
{ 
	n=tong(n); 
	long long f0=0,f1=1,f2=1; 
	long long fn; 
	if(n==0) return 0; 
	else if(n==1) return 1; 
	else 
	  { 
	    for (int i=0;i<=n;i++)
		  { 
		    fn=f1+f2; f1=f2; f2=fn; 
			if(fn==n) return 1; 
		  } 
	  } 
	return 0; 
} 
int main()
{ 
	int a,b,temp; 
	scanf("%d%d",&a,&b); 
	if(a>b)
	  { 
	    temp = b; 
		b = a; 
		a = temp; 
	  } 
	for (int i=a;i<=b;i++)
	  { 
	    if(nt(i)==1 && fabo(i)==1) printf("%d ",i); 
	  } 
}
