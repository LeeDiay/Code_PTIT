#include<bits/stdc++.h>

using namespace std;

int i, m, n, res, j;
int a[105][109], vs[109][109];

void Try(int i, int j)
{
	if (i == m && j == n)
	{
		res++;
		return;
	}
	if (i + 1 <= m && vs[i + 1][j] == 0)
		Try(i + 1, j);
	if (j + 1 <= n && vs[i][j + 1] == 0)
		Try(i, j + 1);
	
}

void process()
{
	int t;
	cin >> t;
	while (t--)
	{
		res = 0;
		cin >> m >> n;
		memset(vs, 0, sizeof(vs));
		for (i = 1; i <= m; i++)
			for (j = 1; j <= n; j++)
				cin >> a[i][j];
		
		Try(1, 1);
		cout << res;
		cout << endl;
	}
}

int main()
{
	process();
}
