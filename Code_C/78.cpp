#include <stdio.h>
int main()
{
	int n;
	scanf("%d",&n);
	for (int i=0; i<n;i++)
	 {
	 	int a,b,c,d;
	    scanf ("%d%d%d%d",&a,&b,&c,&d);
	    if (c-a==d-b) printf ("YES\n");
	    else printf("NO\n");	
	 }
}
