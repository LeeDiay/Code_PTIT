#include<bits/stdc++.h>

using namespace std;

void process()
{
	int n, k;
	cin >> n;
	pair<int, int> a[n];
	for (int i = 0; i < n; i++)
	{
		cin >> a[i].first;
		a[i].second = i;
	}
	
	sort(a, a + n);
	
	int res = -1e7;
	int Min = a[0].second;
	k = a[0].first;
	for (int i = 0; i < n; i++)
	{
		if (a[i].first > k)
			res = max(res, a[i].second - Min);
		if (Min > a[i].second) 
		{
            Min = a[i].second;
            k = a[i].first;
        }
	}
	cout << res;
	
}

int main()
{
	int t;
	cin >> t;
	while (t--)
	{
		process();
		cout << endl;
	}
}
