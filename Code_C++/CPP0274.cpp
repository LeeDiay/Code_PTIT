#include<bits/stdc++.h>

using namespace std;

void process()
{
	int t; 
	cin >> t;
	while (t--)
	{
		int n, i;
		int a[100009], check[100009] = {0};
		cin >> n;
		int sum = 0;	
		for (i = 1; i <= n; i++)
		{
			cin >> a[i];
			check[a[i]]++;
		}
		for (i = 1; i <= n; i++)
		{
			if (check[a[i]] > 1)
				sum ++;
		}
		cout << sum << endl; 
	}
}

int main()
{
	process();
}
