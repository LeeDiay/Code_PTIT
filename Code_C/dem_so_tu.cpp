#include<stdio.h>
#include<string.h>
int main()
{
	int j,t,dem=0;
	char s[2000];
	scanf("%d", &t);
	for (j=1; j<=t; j++)
	  {
	  	fflush(stdin);
		int i;
		gets(s);
		while (s[0]==' ')
       	    strcpy(&s[0],&s[1]);
        
    	while ( s[strlen(s)-1] == ' ')
        	strcpy(&s[strlen(s)-1], &s[strlen(s)]);
        
    	for (i=0; i<strlen(s); i++)
           if (s[i] == ' ' && s[i+1] == ' ')  
             {
			    strcpy(&s[i],&s[i+1]);
			    i--;
		     }
		if (s[0]!=' ') dem=1;
		for (i=0; i<strlen(s); i++)
	      if (s[i]==' ') dem++;
		printf("%d", dem);
		printf("\n");
	  }
}
