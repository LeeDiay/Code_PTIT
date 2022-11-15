#include<bits/stdc++.h>

using namespace std;

void process()
{
	int t, n, i, j;
	int a[200][200];
	cin >> t;
	while (t--)
	{
		cin >> n;
		for (i = 1; i <= n; i++)
			for (j = 1; j <= n; j++)
				cin >> a[i][j];
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				if (i == 1 || i == n || j == 1 || j == n )
					cout << a[i][j] << " ";
				else cout << " " << " ";
			}
			cout << endl;
	}
	}
}

int main()
{
	process();
}
