#include<bits/stdc++.h>

using namespace std;


void process()	
{
	int t, n, i, x;
	cin >> t;
	while (t--)
	{
		cin >> n >> x;
		int a[n+5];
		int check[n+5] = {0};
		for ( i = 0; i < n; i++)
		{
			int j;
			cin >> j;
			check[j]++;
		}
		if (check[x] == 0) cout << "-1";
		else cout << check[x];
		cout << endl;
	}
	
}

int main()
{
	process();
}
