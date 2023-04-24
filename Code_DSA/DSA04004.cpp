#include<bits/stdc++.h>

using namespace std;

long long const mod = 123456789;

long long solve(long long n, long long k)
{
	long long x = pow(2, n - 1);
	if (k == x) return n;
	if (k < x) return solve(n - 1, k);
	else return solve(n - 1, k - x);
}

void process()
{
	long long t, n, k;
	cin >> t;
	while (t--)
	{
		cin >> n >> k;
		cout << solve(n, k) << endl;			
	}
}

int main()
{
	ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
	process();
}
