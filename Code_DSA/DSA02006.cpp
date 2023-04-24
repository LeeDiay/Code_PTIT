#include <bits/stdc++.h>
using namespace std;

int a[1000], c ;

void Sinh(int a[], int b[], int n, int k)
{
	int i, sum;
	c = 0;
	for (i = 1; i <= n; i++)
		a[i] = 1;
	while (1)
	{
		sum = 0;
		int tong = 0;
		for (i = 1; i <= n; i++)
			if (a[i] == 1)
				sum += b[i];
		if (sum == k)
		{
			c++;
			cout << "[";
			for (i = 1; i <= n; i++)
				if (a[i] == 1) 
				{
					tong += b[i];
					if (tong < k) 
						cout << b[i] << " ";
					else cout << b[i];

				}
			cout << "] ";
		}
		i = n;
		while (i > 0 && a[i] == 0)
		{
			a[i] = 1;
			i--;
		}
		if (i == 0) 
		{
			return;
		}
		else a[i] = 0;
	}
}

void process()
{
	int n, k, i, t;
	cin >> t;
	while (t--)
	{
		cin >> n >> k;
		int b[n + 5];
		for (i = 1; i <= n; i++)
			cin >> b[i];
		sort(b + 1, b + n + 1);
		Sinh(a, b, n, k);
		if (c == 0)
			cout << "-1";
		cout << endl;
	}
	
}

int main()
{
	process();
}
