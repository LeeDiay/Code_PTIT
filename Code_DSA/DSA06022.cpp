#include <bits/stdc++.h>
using namespace std;

void process()
{
	int t, n, i, k;
	cin >> t;
	while (t--)
	{
		cin >> n;
		int a[n + 5];
		int check = -1;
		for (i = 0; i < n; i++)
		{
			cin >> a[i];
		}
		sort(a, a+ n);
		if (a[0] != a[1])
			cout << a[0] << " " << a[1] << endl;
		else cout << -1  << endl;
	}
}

int main()
{
	ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
	process();
}
