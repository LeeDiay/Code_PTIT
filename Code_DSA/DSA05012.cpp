#include<bits/stdc++.h>

using namespace std;

int a[1009][1009];

const int mod = 1e9 + 7;

void solve(int n, int k)
{
	int i, j;
	for (i = 1; i <= 1000; i++)
		for (j = 0; j <= i; j++)
		{
			if (j == 0 || j == i)
				a[i][j] = 1;
			if (j == 1 || j == i - 1)
				a[i][j] = i;
			else 
				a[i][j] = (a[i-1][j-1] + a[i-1][j]) % mod;
		}
	cout << a[n][k] << endl;
}

void process()
{
	long long t, n, k, i;
	cin >> t;
	while (t--)
	{
		cin >> n >> k;
		solve(n, k);
	}
}

int main()
{
	ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
   	process();
}

