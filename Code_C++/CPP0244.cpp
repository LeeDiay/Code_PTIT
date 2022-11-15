#include<bits/stdc++.h>

using namespace std;

void process()
{
	int n, i;
	set<int> s;
	int a[100000];
	cin >> n;
	for (i = 1; i <= n; i++)
	{
		cin >> a[i];
		s.insert(a[i]);
	}
	for (int x : s)
		cout << x << " ";
}

int main()
{
	process();
}
