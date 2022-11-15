#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int check(int a)
{
	int i, d = 1;
	if (a < 2) d = 0;
	for (i = 2; i <= sqrt(a); i++)
	{
		if (a % i == 0)
		{
			d = 0;
			break;
		}
	}
	return d;
}

int main()
{
	int n;
	scanf("%d", &n);
	int snt = check(n);
	if (snt == 0) printf("Ko la snt");
	else printf("La snt");
}
