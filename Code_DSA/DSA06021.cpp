#include <bits/stdc++.h>
using namespace std;

void process()
{
	int t, n, i, k;
	cin >> t;
	while (t--)
	{
		cin >> n >> k;
		int a[n + 5];
		int check = -1;
		for (i = 0; i < n; i++)
		{
			int x;
			cin >> x;
			if (x == k)
				check = i;
		}
		cout << check + 1;
		cout << endl;
	}
}

int main()
{
	ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
	process();
}
