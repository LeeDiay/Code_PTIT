#include <bits/stdc++.h>
using namespace std;

void process()
{
	int t, i, n, k, count;
	cin >> t;
	while (t--)
	{
		cin >> n >> k;
		count = 0;
		int a[n+5];
		for (i = 1; i <= n; i++)
			cin >> a[i];
		for (i = 1; i <= n; i++)
			for (int j = i + 1; j <= n; j++)
				if (a[i] + a[j] == k)
					count++;
		cout << count << endl;
	}
}

int main()
{
	process();
}
