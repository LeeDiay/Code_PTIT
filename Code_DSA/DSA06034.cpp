#include<bits/stdc++.h>

using namespace std;

void process()
{
	long long t, n, k, i;
	cin >> t;
	while (t--)
	{
		cin >> n >> k;
		vector<long long> a(n + 1);
		for (i = 0; i < n; i++)
			cin >> a[i];
		sort(a.begin(), a.end());
		long long res = 0;
		for (i = 0; i < n; i++)
			res += upper_bound(a.begin() + 1 + i, a.end(), k - a[i]) - lower_bound(a.begin() + 1 + i, a.end(), k - a[i]);
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

