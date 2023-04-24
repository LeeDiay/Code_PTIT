#include<bits/stdc++.h>

using namespace std;

void process()	
{
	long long t, n, i, k, sum1, sum2, res;
	cin >> t;
	while (t--)
	{
		cin >> n >> k;
		int a[n + 5];
		for (i = 0; i < n; i++)
			cin >> a[i];
		sort(a, a + n);
		int j = 0;
		sum1 = 0; 
		sum2 = 0;
		while (j < n)
		{
			if (j < k) 
				sum1 += a[j];
			else sum2 += a[j];
			j++;
		}
		int res1 = abs(sum1 - sum2);
		
		sum1 = 0;
		sum2 = 0;
		j = 0;
		while (j < n)
		{
			if (j < n - k) 
				sum1 += a[j];
			else sum2 += a[j];
			j++;
		}
		int res2 = abs(sum1-sum2);
		res = max(res1, res2);
		cout << res << endl;
	}
}

int main()
{
	process();
}
