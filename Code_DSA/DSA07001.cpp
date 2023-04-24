#include<bits/stdc++.h>
using namespace std;

void process()
{
	int x;
	string s;
	vector<int> v;
	stack<int> st;
	while (cin >> s)
	{
		
		if (s == "push")
		{
			cin >> x;
			//st.push(x);
			v.push_back(x);
		}
		if (s == "pop")
		{
			if (v.empty() != 1)
			{
				v.pop_back();
				//st.pop();
			}
		}
		if (s == "show")
		{
			if (v.empty())
				cout << "empty";
			for (int i : v)
				cout << i << " ";
			cout << endl;
		}
	}
}

int main()
{
	process();
}
