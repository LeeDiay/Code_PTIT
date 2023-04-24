#include<bits/stdc++.h>

using namespace std;

long long const mod = 1e9 + 7;

long long dao(long long n)
{
	long long res = 0;
	while (n != 0)
	{
		res = res * 10 + n % 10;
		n /= 10;
	}
	return res;
}

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
		long long r = dao(n);
		long long ans = Powerr	(n, r);
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
