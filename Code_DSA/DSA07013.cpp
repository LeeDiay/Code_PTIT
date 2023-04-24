#include<bits/stdc++.h>
using namespace std;

int cal(int a, int b, char c)
{
	if (c == '+')
		return a + b;
	if (c == '-')
		return a - b;
	if (c == '*')
		return a * b;
	if (c == '/')
		return a / b;
}

void process()
{
	int i;
	string s;
	stack<int> st;
	cin >> s;
	int n = s.length();
	for (i = 0; i < n; i++)
	{
		if (s[i] != '+' && s[i] != '-' && s[i] != '*' && s[i] != '/')
			st.push(s[i] - '0');
		else
		{
			int x = st.top(); st.pop();
			int y = st.top(); st.pop();
			int tmp = cal(y, x, s[i]);
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
