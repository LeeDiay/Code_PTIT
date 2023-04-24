#include<bits/stdc++.h>
using namespace std;

void process()
{
	int i;
	string s;
	cin >> s;
	stack<string> st;
	int n = s.length();
	for (i = 0; i < n; i++)
	{
	
		if (s[i] != '+' && s[i] != '-' && s[i] != '*'  && s[i] != '/')
		{
			string tmp = string(1, s[i]);
			st.push(tmp);
		}
		else
		{
			string x = st.top(); st.pop();
			string y = st.top(); st.pop();
			string z = "(" + y + s[i] + x + ")";
			st.push(z);
		}
	}
	cout << st.top();
}

int main()
{
	
	int t;
	cin >> t;
	cin.ignore();
	while (t--)
	{
		process();
		cout << endl;
	}

}
