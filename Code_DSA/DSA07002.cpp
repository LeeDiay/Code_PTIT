#include<bits/stdc++.h>
using namespace std;

void process()
{
	
	long long x, t;
	string s;
	stack<int> st;
	cin >> t;
	while (t--)
	{
		cin >> s;
		if (s == "PUSH")
		{
			cin >> x;
			st.push(x);	
		}
		if (s == "POP")
			if (st.empty() == 0)
				st.pop();
		if (s == "PRINT")
		{
			if (st.empty() == 1)
				cout << "NONE" << endl;
			else
			{
				int top = st.top();
				cout << top << endl;
			}
		}
	}
}

int main()
{
	process();
}
