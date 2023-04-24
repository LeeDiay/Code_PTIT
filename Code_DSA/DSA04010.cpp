#include <bits/stdc++.h> 
using namespace std;

void process()
{
	int t;
	cin >> t;
	while (t--)
	{
		int n; 
		cin >> n;
		int a[n + 5];
		for (int i = 1; i <= n; i++)
			cin >> a[i];
		int sum = 0, max_sum = 0;
		for (int i = 1; i <= n; i++)
		{
			sum += a[i];
			if (sum > max_sum)
				max_sum = sum;
		
		if (sum < 0)
			sum = 0;
		
		}	
		cout << max_sum << endl;
	}
}

int main() 
{ 
	process();
}
