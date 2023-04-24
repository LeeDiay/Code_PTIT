#include <bits/stdc++.h>
using namespace std;

void process()
{
	long long t, n, i, j, x, m, max, min;
	cin >> t;
	while (t--)
	{
		cin >> n >> m;
		max = -1e6;
		min = 1e6;
		for (i = 0; i < n; i++)
		{
			cin >> x;
			if (x > max) 
				max = x;
		}
		for (i = 0; i < m; i++)
		{
			cin >> x;
			if (x < min)
				min = x;
		}
		cout << min * max << endl;
	}
}

int main()
{
	ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
	process();
}
