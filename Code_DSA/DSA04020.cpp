#include <bits/stdc++.h>
using namespace std;

void process()
{
	int t, n, i, k, min;
	cin >> t;
	while (t--)
	{
		cin >> n >> k;
		vector<int> a(n);
		int res = -1;
		for (i = 1; i <= n; i++)
		{
			int x;
			cin >> x;
			if (x == k) 
			{
				res = i;
			}
		}
		if (res == -1) cout << "NO";
		else cout << res;
		cout << endl;
		}
}

int main()
{
	ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
	process();
}
