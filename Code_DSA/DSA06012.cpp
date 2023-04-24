#include<bits/stdc++.h>

using namespace std;

void process()
{
	int t, i, n, k;
	cin >> t;
	while (t--)
	{
		cin >> n >> k;
		int a[n + 5];
		for (i = 0; i < n; i++)
			cin >> a[i];
		sort(a, a + n);
		for (i = 1; i <= k; i++)
			cout << a[n-i] << " ";
		cout << endl;
	}
}

int main()
{
	process(); 	
}
