#include<bits/stdc++.h>

using namespace std;

void process()
{
	long long t, n, k, i;
	cin >> t;
	while (t--)
	{
		cin >> n >> k;
		long long a[n + 5];
		for (i = 0; i < n; i++)
			cin >> a[i];
		sort(a, a + n);
		long long res = 0;
		for (i = 0; i < n; i++)
			for (int j = i + 1; j < n; j++)
			{
				long long x = k - a[i] - a[j];
				res += lower_bound(a + j + 1, a + n, x) - (a + j + 1);
			}
		cout << res;
		cout << endl;
	}
}

int main()
{
	ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
   	process();
}


