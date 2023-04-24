#include<bits/stdc++.h>
using namespace std;

vector<long long> res;

void process()
{
	queue<long long> q;
	q.push(9);
	res.push_back(9);
	while (res.size() < 10000)
	{
		int dinh = q.front();
		q.pop();
		res.push_back(dinh * 10);
		res.push_back(dinh * 10 + 9);
		q.push(dinh * 10 );
		q.push(dinh	* 10 + 9);
	}	
}

int main()
{
	process();
	int t;
	cin >> t;
	while (t--)
	{
		int n;
		cin >> n;
		for (auto x : res)
		{
			if (x % n == 0)
			{
				cout << x << endl;
				break;
			}
		}
	}
}

