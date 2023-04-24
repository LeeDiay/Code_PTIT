#include<bits/stdc++.h>

using namespace std;

long long const mod = 123456789;

long long Powerr(long long n, long long k)
{
	if (k == 0) return 1;
	long long x = Powerr(n, k/2);
	if (k % 2 == 0)
		return (x * x) % mod;
	else 
		return (n * ((x * x) % mod)) % mod;
}

void process()
{
	long long t, n, i;
	cin >> t;
	while (t--)
	{
		cin >> n;
		long long ans = Powerr(2, n - 1);
		cout << ans;
		cout << endl;
			
	}
}

int main()
{
	ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
	process();
}
