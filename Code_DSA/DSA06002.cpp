#include <bits/stdc++.h>
using namespace std;

void process()
{
	int t, n, i, x;
	cin >> t;
	while (t--)
	{
		cin >> n >> x;
		int a[n + 5];
		set<int> s;
		for (i = 0; i < n; i++)
		{
			cin >> a[i];
			s.insert(abs(a[i] - x));
		}
		for (auto j : s)
		{
			for (i = 0; i < n; i++)
				if (abs(a[i] - x) == j)
					cout << a[i] << " ";
		}
		cout << endl;
	}
}

int main()
{
	ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
	process();
}
