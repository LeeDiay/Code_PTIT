#include<bits/stdc++.h>
using namespace std;

void process()
{
	int i;
	string s;
	stack<string> st;
	cin >> s;
	int n = s.length();
	for (i = n - 1; i >= 0; i--)
	{
		string z = string(1, s[i]);
		if (s[i] !=  '+' && s[i] != '-' && s[i] != '*' && s[i] != '/')
			st.push(z);
		else
		{
			string x = st.top(); st.pop();
			string y = st.top(); st.pop();
			string tmp = "(" + x + z + y + ")";
			st.push(tmp);
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
