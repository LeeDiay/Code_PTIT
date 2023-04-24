#include<bits/stdc++.h>

using namespace std;

void process()
{
	int n, t, i, x;
	cin >> t;
	while (t--)
	{
		cin >> n >> x;
		vector<int> a(n+1);
		for (i = 0; i < n; i++)
			cin >> a[i];
		int res = upper_bound(a.begin(), a.end(), x) - a.begin();
		if (res > 0) cout << res;
		else cout << -1;
		cout << endl;
	}
}

int main()
{
	process();
}
