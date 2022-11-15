#include<stdio.h> 
int main() 
{ 
	int test; 
	scanf("%d", &test); 
	while(test--) 
	  { 
	     int n; 
		 scanf("%d",&n); 
		 int a[100000]; 
		 int b[100000]; 
		 int k=0; 
		 for (int i = 0;i < n;i++) 
		   scanf("%d",&a[i]); 
		int c=a[n-1]; 
		for(int i=n-1; i>=0; i--) 
		  { 
		     if (a[i] < a[i-1])
			   { 
			      b[k] = a[i-1]; 
				  k++;
				} 
			else 
			  { 
			     int tmp = a[i-1]; 
				 a[i-1] = a[i];
				 a[i] = tmp; 
			  } 
		  } 
		for (int i = k-1;i >=0 ;i--)
		  { 
		    printf("%d ",b[i]);
		  } 
		printf("%d",c); 
		printf("\n"); 
	  } 
}
