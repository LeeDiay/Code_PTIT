#include<bits/stdc++.h>

using namespace std;

void process()
{
	int t;
	cin >> t;
	while (t--)
	{
		int n, s, sum;
		cin >> n >> s;
		vector<int> a(n);
		vector<bool> dp(s+1, false);
		int L[1009] = {1};
		for (int i = 0; i < n; i++)
		{
			cin >> a[i];
		}
		dp[0] = true;
		for (int i = 0; i < n; i++)
			for (int j = s; j >= a[i]; j--)
				if (dp[j - a[i]] == true)
					dp[j] = true;
		if (dp[s] == true) cout << "YES";
		else cout << "NO";
		cout << endl;
	}
}

int main()
{
	ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    process();
}




