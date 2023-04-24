#include <bits/stdc++.h>
using namespace std;

void process()
{
	int t, i, n;
	cin >> t;
	while (t--)
	{
		cin >> n;
		vector<int> a(n);
		for (i = 0; i < n; i++)
			cin >> a[i];
		sort(a.begin(), a.end(), greater<int>());
		for (i = 0; i < n/2; i++)
			cout << a[i] << " " << a[n-i-1] << " ";
		if (n % 2 == 1) 
			cout << a[n/2];
		cout << endl;
			
	}
}

int main()
{
	process();
}
