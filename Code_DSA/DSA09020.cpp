#include<bits/stdc++.h>
using namespace std;

void process()
{
	int n;
	cin >> n;
	cin.ignore();
	int a[n+1][n+1] = {};
	for (int i = 1; i <= n; i++)
	{
		string s;
		getline(cin, s);
		stringstream ss(s);
		int x;
		while (ss >> x)
		{
			a[i][x] = a[x][i] = 1;
		}
			
	}
	for (int i = 1; i <= n; i++)
	{
		for (int j = 1; j <= n; j++)
			cout << a[i][j] << " ";
		cout << endl;
	}
	
}

int main()
{
	int t;
	t = 1;
	while (t--)
	{
		process();
	}
}

