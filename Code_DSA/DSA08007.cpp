#include<bits/stdc++.h>

using namespace std;

void process()
{
	string s;
	cin >> s;
	queue<string> q;
	int res = 0;
	q.push("1");
	while (!q.empty())
	{
		string z = q.front();
		q.pop();
		res++;
		
		string x = z + "0";
		if (x.length() > s.length() || (x.length() == s.length() && x > s))
			break;
		q.push(x);
		
		string y = z + "1";
		if (y.length() > s.length() || (y.length() == s.length() && y > s))
			break;
		q.push(y);
	}
	cout << res + q.size();
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
