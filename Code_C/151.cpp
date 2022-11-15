#include<stdio.h>
#include<string.h>
long long chuyendoi(char s[25])
{
     long long kq = 0;
	 for (int i = 0; i < strlen(s); i++)
	  {
	 	kq = kq*10 + s[i] - '0';
	  }	
	 return kq;
}
long long min(char s[25])
{
	for (int i = 0; i < strlen(s); i++)
		if (s[i] == '6') s[i] = '5';
	return chuyendoi(s);
}
long long max(char s[25])
{
	for (int i = 0; i < strlen(s); i++)
		if(s[i] == '5') s[i] = '6';
	return chuyendoi(s);
}
int main()
{
	long long k;
	scanf("%lld", &k);
	while (k--)
	{
		char s1[25], s2[25];
	    scanf("%s %s", s1, s2);
	     printf("%lld %lld", min(s1) + min(s2), max(s1) + max(s2));
		printf("\n");
	}
}
