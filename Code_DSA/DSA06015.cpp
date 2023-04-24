#include <bits/stdc++.h>
using namespace std;

void process()
{
	int t, n, i;
	cin >> t;
	while (t--)
	{
		cin >> n;
		int a[n + 5];
		for (i = 0; i < n; i++)
			cin >> a[i];
		sort(a, a + n);
		for (i = 0; i < n; i++)
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
