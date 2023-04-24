#include <bits/stdc++.h>
using namespace std;

void process()
{
	int t, n, i, j, x, m;
	cin >> t;
	while (t--)
	{
		cin >> n >> m;
		vector<int> a;
		for (i = 0; i < n + m; i++)
		{
			cin >> x;
			a.push_back(x);
		}
		sort(a.begin(), a.end());
		for (i = 0; i < n + m; i++)
			cout << a[i] << " ";
		cout << endl;
	}
}

int main()
{
	ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
	process();
}
