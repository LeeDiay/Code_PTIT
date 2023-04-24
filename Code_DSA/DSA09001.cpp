#include<bits/stdc++.h>

using namespace std;

void input()
{
	int v, e;
	vector<int> g[1000];
	cin >> v >> e;
	for (int i = 1; i <= e; i++)
	{
		int x, y;
		cin >> x >> y;
		g[x].push_back(y);
		g[y].push_back(x);
	}
	for (int i = 1; i <= v; i++)
	{
		cout << i << ": ";
		for (int j : g[i])
			cout << j << " ";
		cout << endl;
	}
}

void process()
{
	int t;
	cin >> t;
	while (t--)
	{
		input();
	}
}
int main()
{
	ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    process();
}


