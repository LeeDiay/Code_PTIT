#include<stdio.h>
int main()
{
	int a,b,c=0;
	scanf("%d",&a);
	for (int i=2;i<=200009;i++)
	{
		b=0;
		for (int o=2;o<i;o++)	
		{
			if (i%o==0)
			{
				b++;
				break;
			}
		}
			if (b==0)
			{
				printf("%d\n",i);
				c++;
			}
		if(c==a)
		{
			break;
		}
	}
}
