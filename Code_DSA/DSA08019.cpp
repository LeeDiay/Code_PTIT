#include<bits/stdc++.h>
using namespace std;

vector<string> res;

void process()
{
	queue<string> q;
	q.push("6");
	q.push("8");
	res.push_back("6");
	res.push_back("8");
	while (true == true)
	{
		string dinh = q.front();
		q.pop();
		if (dinh.length() == 15) break;
		res.push_back(dinh + "6");
		res.push_back(dinh + "8");
		q.push(dinh + "6");
		q.push(dinh + "8");
	}	
}

int main()
{
	process();
	int t;
	cin >> t;
	while (t--)
	{
		int n, count = 0;
		cin >> n;
		vector<string> tmp;
		for (auto x : res)
		{
			if (x.length() == n + 1) 
				break;
			tmp.push_back(x);
			count++;
		}
		reverse(tmp.begin(), tmp.end());
		cout << count << endl;
		for (auto x : tmp)
			cout << x << " ";
		cout << endl;
	}
}

