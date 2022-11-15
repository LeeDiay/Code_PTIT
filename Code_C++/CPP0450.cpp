#include<bits/stdc++.h> 

using namespace std; 

void process()
{
	long long i, t, n;
	cin >> t;
	while (t--)
	{
		long long res = 0;
		cin >> n;
		long long a[n+5], check[100000] = {0};
		for (i = 1; i <= n; i++)
			cin >> a[i];
		for (i = 1; i <= n; i++)
		{
			check[a[i]]++;
			if (check[a[i]] > 1)
			{
				cout << a[i] << endl;
				res = 1;	
				break;
			}	
		}
		if (res == 0) cout << "-1" << endl;	
	}
}

int main() 
{ 
	process();
}
