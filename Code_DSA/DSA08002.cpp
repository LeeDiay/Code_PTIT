#include<bits/stdc++.h>
using namespace std;

void process()
{
	int t, i, x;
	string s;
	cin >> t;
	queue<int> q;
	while (t--)
	{
		cin >> s;
		if (s == "PUSH")
		{
			cin >> x;
			q.push(x);
		}
		if (s == "PRINTFRONT")
		{
			if (q.empty())
				cout << "NONE" << endl;
			else cout << q.front() << endl;
		}
		if (s == "POP")
			if (!q.empty())
				q.pop();
	}
}

int main()
{
	process();
}

