#include<bits/stdc++.h>

using namespace std;

int a[1009][1009];

const int mod = 1e9 + 7;

void solve(int n, int k, int mid)
{
	if (k == mid)
		cout << char('A' + n - 1);
	if (k < mid)
	{
		n--;
		solve(n, k, mid / 2);
	}
	if (k > mid)
	{
		n--;
		solve(n, k-mid, mid/2) ;
	}

}

void process()
{
	long long t, n, k, i;
	cin >> t;
	while (t--)
	{
		cin >> n >> k;
		int mid = pow(2, n - 1);
		solve(n, k, mid);
		cout << endl;
	}
}

int main()
{
	ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
   	process();
}

