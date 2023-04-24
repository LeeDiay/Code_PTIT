#include <bits/stdc++.h>
using namespace std;

void process()
{
	int t, i, n, m, x;
	cin >> t;
	while (t--)
	{
		cin >> n >> m;
		set<int> a, b;
		map<int, int> mp;
		for (i = 0; i < n; i++)
		{
			cin >> x;
			a.insert(x);
		}
		for (i = 0; i < m; i++)
		{
			cin >> x;
			b.insert(x);
		}
		for (auto i : a)
			mp[i]++;
		for (auto i : b)
			mp[i]++;
		
		for (auto i : mp)
			cout << i.first << " ";
		cout << endl;
		for (auto i : mp)
			if (i.second > 1)
				cout << i.first << " ";
		cout << endl;
	}
}

int main()
{
	ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
	process();
}
