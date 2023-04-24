#include <bits/stdc++.h>
using namespace std;

void process()
{
	int t, n, i, j;
	cin >> t;
	while (t--)
	{
		cin >> n;
		set<char> se;
		string s;
		for (i = 0; i < n; i++)
		{
			cin >> s;
			for (j = 0; j <= s.length() - 1; j++)
				se.insert(s[j]);
		}
		for (auto i : se)
			cout << i << " ";
		cout << endl;
	}
}

int main()
{
	ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
	process();
}
