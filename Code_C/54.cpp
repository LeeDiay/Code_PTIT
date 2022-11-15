#include<stdio.h>
#include<math.h>
#include<string.h>
int main()
{
	char s[10000];
	gets(s);
	for (int i=0; i<=strlen(s); i++)
		if (s[i]>=65 && s[i]<=90)
		    printf("%c", s[i]);
}


