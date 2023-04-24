#include<bits/stdc++.h>

using namespace std;

void process()
{
	int n, k;
	long long mod = 1e9 + 7;
	cin >> n >> k;
	long long dp[n + 5] = {0};
	dp[0] = dp[1] = 1;
	for (int i = 2; i <= n; i++)
	{
		for (int j = 1; j <= min(i, k); j++)
		{
			dp[i] += dp[i - j];
			dp[i] %= mod;
		}
	}
	cout << dp[n];
}

int main()
{
	ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int t;
    cin >> t;
    while (t--)
    {
    	process();
    	cout << endl;
	}
}




