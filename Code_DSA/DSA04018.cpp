#include <bits/stdc++.h>
using namespace std;

void process()
{
	int t, n, i, k, count, x;
	cin >> t;
	while (t--)
	{
		cin >> n;
		count = 0;
		vector<int> a(n);
		for (i = 0; i < n; i++)
		{
			cin >> x;
			if (x == 0)
				count ++;
		}
		cout << count << endl;
	}
}

int main()
{
	ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
	process();
}
