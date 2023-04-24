#include<bits/stdc++.h>
using namespace std;

int n;

void process()
{
	int t;
	cin >> t;
	while (t--)
	{
		cin >> n;
		int i, j;
		long long val;
		priority_queue<long long, vector<long long>, greater<long long> > a;
		for (i = 0; i < n; i++)
		{
			cin >> val;
			a.push(val);
		}
		long long res = 0;
		while (a.size() > 1)
		{
			long long x = a.top();
			a.pop();
			long long y = a.top();
			a.pop();
			a.push(x + y);
			res += x + y;
		}
		cout << res << endl;
	}
}
int main()
{
	ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    process();
	
	
}

