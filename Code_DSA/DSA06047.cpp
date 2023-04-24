#include<bits/stdc++.h>

using namespace std;

long long const mod = 123456789;

bool check(long long a[], int n)
{
	int i, l, r;
	for (i = 0; i < n; i++)	
		a[i] = a[i] * a[i];
	sort(a, a + n);
	for (i = n - 1; i >= 2; i--)
	{
		l = 0; r = n - 1;
		while (l < r)
		{
			if (a[l] + a[r] == a[i])
				return true;
			if (a[l] + a[r] < a[i])
				l++;
			else r--;
		}
	}
	return false;
}
void process()
{
	long long t, n, k;
	cin >> t;
	while (t--)
	{
		cin >> n;
		long long a[n+ 5];
		for (int i = 0; i < n; i++)
			cin >> a[i];
		if (check(a, n) == true) cout << "YES";
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
