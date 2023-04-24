#include<bits/stdc++.h>

using namespace std;

const long long mod = 1e9 + 7;

void process()
{
	long long n, t, i, max = 0;
	cin >> t;
	while (t--)
	{
		cin >> n;
		max = 0;
		long long a[n + 5];
		for (i = 0; i < n; i++)
			cin >> a[i];
		sort(a, a + n);
		for (i = 0; i < n; i++)
		{
			max += a[i] * i;
			max %= mod;
		}
		cout << max << endl;
	}
}

int main()
{
	process();
}
