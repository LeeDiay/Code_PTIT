#include<bits/stdc++.h>

using namespace std;

int BiSearch(int a[], int n, int x)
{
	int r = n;
	int l = 1;
	int mid;
	while (r >= l)
	{
		mid = (r + l) / 2;
		if (a[mid] == x)
			return 1;
		if (a[mid] < x)
			l = mid + 1;
		if (a[mid] > x)
			r = mid - 1;
	}
	return -1;
}

void process()
{
	int t, n, i, x;
	int a[100000];
	cin >> t;
	while (t--)
	{
		cin >> n >> x;
		for (i = 1; i <= n; i++)
			cin >> a[i];
		sort(a, a + n);
		int res = BiSearch(a, n, x);
		cout << res << endl;
	}
}

int main()
{
	process();
}

