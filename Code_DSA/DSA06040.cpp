#include<bits/stdc++.h>
using namespace std;

void process()
{
	int n, m, k;
	cin >> n >> m >> k;
	vector<int> a(n), b(m), c(k);
	for (int &i : a) cin >> i;
	for (int &i : b) cin >> i;
	for (int &i : c) cin >> i;
	
	int i = 0, j = 0, l = 0, check = 0;
	while (i < n && j < m && l < k)
	{
		if (a[i] == b[j] && a[i] == c[l])
		{
			cout << a[i] << " ";
			i++;
			j++;
			l++;
			check = 1;
			continue;
		}
		if (a[i] < b[j])
			i++;
		else if (b[j] < c[l])
			j++;
		else l++;
	}
	if (!check)
		cout << "-1";
	
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

