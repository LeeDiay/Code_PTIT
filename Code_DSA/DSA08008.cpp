#include<bits/stdc++.h>

using namespace std;

bool kiemtra(string s, int n)
{
	int so = 0;
	for (int i = 0; i < s.length(); i++)
		so = (so * 10  + (s[i] - '0')) % n;
	return so == 0;
}

void process()
{
	int n; cin >> n;
	queue<string> q;
	q.push("1");
	while (1)
	{
		string x = q.front(); q.pop();
		if (kiemtra(x, n) == 1)
		{
			cout << x;
			return;
		}
		q.push(x + "0");
		q.push(x + "1");
	}
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
