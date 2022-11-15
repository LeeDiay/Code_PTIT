#include<bits/stdc++.h>

using namespace std;

int main()
{
	long long t, x, n, i, check;
	long long a[100000];
	cin >> t;
	while (t--)
	{
		check = 0;
		cin >> n >> x;
		for (i = 1; i <= n; i++)
			cin >> a[i];
		for (i = 1; i <= n; i++)
		{
			if (a[i] == x) 
			{
				cout << i << endl;
				check = 1;
				break;
			}
		}
		if (check == 0) cout << "-1" << endl;
	}
}
