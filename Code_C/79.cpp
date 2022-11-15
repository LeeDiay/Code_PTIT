#include<stdio.h> 
#include<math.h>
int check(int i)
{  
 int c=i%10,d=1;
 i/=10;
 while(i>0)
   { 
    int b=i%10;
    if(b<=c) 
	 {
		d=0;
		break;
	 }
	c = b;
	i/=10;
   }
	return d;
} 
int main()
{ 
	int t;
	scanf("%d", &t);
	while(t--)
	 {
		int a,b; 
		int dem=0; 
		scanf("%d %d", &a,&b);
		for(int i=a; i<=b;i++)
		 { 
			if(check(i)==1) dem++;
         } 
			  printf("%d\n", dem);
	 } 
}
