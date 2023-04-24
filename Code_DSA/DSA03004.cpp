#include<bits/stdc++.h>

using namespace std;

void process()	
{
	long long t, n, i;
	cin >> t;
	while (t--)
	{
		cin >> n;
		vector<long long> a;
		for (i = 0; i < n; i++)
		{
			long long x; 
			cin >> x;
			if (x != 0)
				a.push_back(x);
		}
		sort(a.begin(), a.end());
		long long sum1 = 0, sum2 = 0;
		for (i = 0; i < a.size(); i++) 
		{
			if (i % 2 == 0)
				sum1 = sum1 * 10 + a[i];
			else sum2 = sum2 * 10 + a[i];
		}
		cout << sum1 + sum2 << endl;
	}
}

int main()
{
	process();
}
