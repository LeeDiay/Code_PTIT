#include <bits/stdc++.h>
using namespace std;

void process()
{
	int t, n, i, x;
	cin >> n;
	int a[n];
	for (i = 0; i < n; i++)
		cin >> a[i];
	cin >> x;
	set<int> se;
	for (i = 0; i < n; i++)
		if (a[i] != x)
			cout << a[i] << " ";
}

int main()
{
	ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
	process();
}
