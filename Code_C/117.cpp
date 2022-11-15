#include <stdio.h>
#include <string.h>
int main()
{
    char s1[100];
    gets(s1);
    char s2[100];
    scanf("%s", s2);
    char a[100][100];
    long long dem=0, i;
    char *chuoi=strtok(s1, " ");
    while (chuoi != NULL)
      {
        strcpy(a[dem++], chuoi);
        chuoi = strtok(NULL, " ");
      }
    for (i=0; i<dem; i++)
        if (strcmp(a[i], s2) != 0)
            printf("%s ", a[i]);
}
