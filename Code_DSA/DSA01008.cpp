#include<bits/stdc++.h>

using namespace std;

void SinhNhiPhan(long long a[], long long n, long long k)
{
	int i, count;
	for (i = 1; i <= n; i++)
		a[i] = 0;
	while (1)
	{
		count = 0;
		for (i = 1; i <= n; i++)
			if (a[i] == 1) count++;
		if (count == k) 
		{
			for (i = 1; i <= n; i++)
				cout << a[i];
			cout << endl;
		}
		i = n;
		while (i > 0 && a[i] == 1)
		{
			a[i] = 0;
			i--;
		}
		if (i == 0)
			return;
		else a[i] = 1;
	}
}

int main()
{
	long long t;
	long long a[1000], n, k;
	cin >> t;
	while (t--)
	{
		cin >> n >> k;
		SinhNhiPhan(a, n, k);
	}
}
