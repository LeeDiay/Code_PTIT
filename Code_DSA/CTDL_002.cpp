#include <bits/stdc++.h>
using namespace std;

int a[1000];

void Sinh(int a[], int b[], int n, int k)
{
	int i, sum, count = 0;
	for (i = 1; i <= n; i++)
		a[i] = 0;
	while (1)
	{
		sum = 0;
		for (i = 1; i <= n; i++)
			if (a[i] == 1)
				sum += b[i];
		if (sum == k)
		{
			for (i = 1; i <= n; i++)
				if (a[i] == 1) 
					cout << b[i] << " ";
			cout << endl;
			count++;
		}
		i = n;
		while (i > 0 && a[i] == 1)
		{
			a[i] = 0;
			i--;
		}
		if (i == 0) 
		{
			cout << count;
			return;
		}
		else a[i] = 1;
	}
}

void process()
{
	int n, k, i;
	cin >> n >> k;
	int b[n + 5];
	for (i = 1; i <= n; i++)
		cin >> b[i];
	Sinh(a, b, n, k);
}

int main()
{
	process();
}
