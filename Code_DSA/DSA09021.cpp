#include<bits/stdc++.h>
using namespace std;

void process()
{
	int n;
	cin >> n;
	int a[n + 5][n + 5];
	for (int i = 1; i <= n; i++)
	{
		for (int j = 1; j <= n; j++)
		{
			cin >> a[i][j];
			if (a[i][j] == 1)
				cout << j << " ";
			
		}
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

