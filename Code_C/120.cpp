#include <stdio.h>
#include <string.h>
#include <stdbool.h>

bool check(char s[500])
{
    int l=strlen(s);
    if (s[0] != '8' || s[l - 1] != '8')
        return 0;
    int tong=0;
    for (int i=0; i<l/2; i++)
     {
        if (s[i] != s[l-i-1])
            return 0;
        tong+=(s[i]-48)*2;
     }
    if (l%2!=0)
        tong+=s[l/2]-48;
    if (tong%10==0)
        return 1;
    else
        return 0;
}

int main()
{
    long long t,i;
    scanf("%lld", &t);
    for (i=1; i<=t; i++)
      {
        char s[500];
        scanf("%s", s);
        if (check(s)==1)
            printf("YES\n");
        else
            printf("NO\n");
      }
    return 0;
}
