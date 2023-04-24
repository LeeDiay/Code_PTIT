#include <bits/stdc++.h>
using namespace std;

void process()
{
	int t, n, i, k, min;
	cin >> t;
	while (t--)
	{
		cin >> n;
		min = 1e7;
		int a[n + 5], b[n+5];
		for (i = 0; i < n; i++)
			cin >> a[i];
		for (i = 0; i < n; i++)
			for (int j = i + 1; j < n; j++)
			{
				int sum = a[i] + a[j];
				if (abs(sum) < abs(min))
					min = sum;
			}
		cout << min << endl;
	}
}

int main()
{
	ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
	process();
}
