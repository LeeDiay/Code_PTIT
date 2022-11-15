#include<bits/stdc++.h>

using namespace std;

void process()
{
	long long n, i, t, m;
	long long a[100005], b[100005];
	cin >> t;
	while (t--)
	{
		long long mul;
		cin >> n >> m;
		for ( i = 0; i < n; i++)
			cin >> a[i];
		sort(a, a + n);
		for (i = 0; i < m; i++)
			cin >> b[i];			
		sort(b, b + m);
		mul = a[n-1] * b[0];
		cout << mul << endl;
	}
}

int main()
{
	process();
}

