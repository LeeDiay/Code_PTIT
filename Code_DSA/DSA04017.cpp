#include <bits/stdc++.h>
using namespace std;

void process()
{
	int t, n, i, k, count, x;
	cin >> t;
	while (t--)
	{
		cin >> n;
		map<int, int> mp;
		vector<int> a(n), b(n);
		for (i = 0; i < n; i++)
		{
			cin >> a[i];
		}
		for (i = 0; i < n - 1; i++)
			cin >> b[i];
		for (i = 1; i < n; i ++)
			if (a[i] != b[i])
			{
				cout << i+1 << endl;
				break;
			}
	}
}

int main()
{
	ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
	process();
}
