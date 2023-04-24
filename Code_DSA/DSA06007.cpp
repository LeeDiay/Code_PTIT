#include <bits/stdc++.h>
using namespace std;

void process()
{
	int t, n, i, k;
	cin >> t;
	while (t--)
	{
		cin >> n;
		int a[n + 5], b[n+5];
		for (i = 0; i < n; i++)
		{
			cin >> a[i];
			b[i] = a[i];
		}
		sort(b, b + n);
		int l, r;
		for (i = 0; i < n; i++)
			if (a[i] != b[i])
			{
				l = i;
				break;
			}
		for (i = 0; i < n; i++)
			if (a[i] != b[i])
				r = i;
		cout << l+1 << " " << r+1 << endl;
	}
}

int main()
{
	ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
	process();
}
