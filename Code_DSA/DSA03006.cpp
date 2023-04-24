#include<bits/stdc++.h>

using namespace std;

void process()	
{
	long long t, n, i, k, check;
	cin >> t;
	while (t--)
	{
		cin >> n;
		check = 1;
		int a[n+5], b[n+5];
		for (i = 0; i < n; i++)
		{
			cin >> a[i];
			b[i] = a[i];
		}
		sort(b, b+ n);
		for (i = 0; i < n; i++)
		{
			if (a[i] != b[i] && a[i] != b[n-i-1])
			{
				check = 0;
				break;
			}
		}
		if (check == 1 ) cout << "Yes" << endl;
		else cout << "No" << endl;
	}
}

int main()
{
	process();
}
