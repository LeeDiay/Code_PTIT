#include<bits/stdc++.h> 

using namespace std; 

void process()
{
	long long i, t, n, x;
	cin >> t;
	while (t--)
	{
		cin >> n >> x;
		long long a[n+5], check[100000] = {0};
		for (i = 1; i <= n; i++)
		{
			cin >> a[i];
			check[a[i]]++;
		}
		if (check[x] == 0) cout << "-1" << endl;
		else cout << check[x] << endl;
	}
}

int main() 
{ 
	process();
}
