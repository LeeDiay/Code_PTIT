#include<stdio.h>
#include<string.h>
int main()
{
	int t,j;
	scanf("%d", &t);
	for (j=0; j<=t; j++)
	  {
	char s[200000];
	int i,dem=0;
	fgets(s, sizeof(s),stdin);
	while (s[0]==' ')
        strcpy(&s[0],&s[1]);
        
    while ( s[strlen(s)-1] == ' ')
        strcpy(&s[strlen(s)-1], &s[strlen(s)]);
        
    for(i=0; i<strlen(s); i++)
        if (s[i] == ' ' && s[i+1] == ' ')  
           {
			  strcpy(&s[i],&s[i+1]);
			  i--;
		  }
	strlwr(s);
	if (s[0]>=97) s[0]-=32;
	for (i=0; i<strlen(s); i++)
	    if (s[i] == ' ' && s[i+1] != ' ') 
		   if (s[i+1]>=97) s[i+1]-=32;
    puts(s);
      }
}
