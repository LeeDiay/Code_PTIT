#include<bits/stdc++.h>
using namespace std;

void process()
{
	int n, i, x;
	cin >> n;
	queue<int> q;
	while (n--)
	{
		cin >> x;
		if (x == 1)
			cout << q.size() << endl;
		if (x == 2)
			if (q.empty())
				cout << "YES" << endl;
			else cout << "NO" << endl;
		if (x == 3)
		{
			int y;
			cin >> y;
			q.push(y);
		}
		if (x == 4)
		{
			if (!q.empty())
				q.pop();
		}
		if (x == 5)
			if (q.empty()) cout << "-1" << endl;
				else cout << q.front() << endl;
		if (x == 6)
			if (q.empty()) cout << "-1" << endl;
				else cout << q.back() << endl;
	}
}

int main()
{
	
	int t;
	cin >> t;
	cin.ignore();
	while (t--)
	{
		process();
	}

}
