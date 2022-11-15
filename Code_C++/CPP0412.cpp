#include<bits/stdc++.h>

using namespace std;

void process()
{
	int n, i, t, x;
	cin >> t;
	vector<int> v;
	while (t--)
	{
		v.clear();
		cin >> n;
		for (i = 0; i  < n; i++)
		{
			cin >> x;
			v.push_back(x);
		}
		sort(v.begin(), v.end());
		for (int i = 0; i < v.size(); i++)
			cout << v[i] << " ";
		cout << endl;
	}
}

int main()
{
	process();
}

