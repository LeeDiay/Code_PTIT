#include<stdio.h> 
int main() 
{ 
    int n,m;
    scanf("%d%d", &n,&m);
    int k=0;
    for(int i=1;i<=n;i++)
     {
        for(int j=1;j<= m+k;j++)
	     { 
	       if(j<=k) printf("~");
	       else 
		   {
		   	if (i==1||i==n||j==k+1||j==k+m) printf("*");
		   	else printf(".");
		   };
	     }
	    printf("\n");
		k++;
     } 
		 
}


