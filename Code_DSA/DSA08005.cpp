#include<bits/stdc++.h>
using namespace std;

vector<string> res;

void process()
{
	queue<string> q;
	q.push("1");
	res.push_back("1");
	while (res.size() < 10000)
	{
		string dinh = q.front();
		q.pop();
		res.push_back(dinh + "0");
		res.push_back(dinh + "1");
		q.push(dinh + "0");
		q.push(dinh + "1");
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
		for (int i = 0; i < n; i++)
			cout << res[i] << " ";
		cout << endl;
	}
}

