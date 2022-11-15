#include<bits/stdc++.h>

using namespace std;

void process()
{
	int i, check[30] = {0};
	string s;
	cin >> s;
	for (i = 0; i < s.length(); i++)
		check[s[i] - 'A']++;
	for (i = 0; i < s.length(); i++)
		if (check[s[i] - 'A'] == 1)
			cout << s[i];
	cout << endl;
}

int main()
{
	int t;
	cin >> t;
	while (t--)
	{
		process();
	}
}
