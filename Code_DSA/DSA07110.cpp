#include<bits/stdc++.h>
using namespace std;

void process()
{
	int i;
	stack<char> st;
	string s;
	bool check = true;
	cin >> s;
	for (i = 0; i < s.length(); i++)
	{
		if (s[i] == '(' || s[i] == '{' || s[i] == '[')
			st.push(s[i]);
		else if (s[i] == ')')
		{
			if (st.empty() == 1) check = false;
			else if (st.top() == '(') 
			 st.pop();
		}
		else if (s[i] == '}')
		{
			if (st.empty() == 1) check = false;
			else if (st.top() == '{') 
			 st.pop();
		}
		else if (s[i] == ']')
		{
			if (st.empty() == 1) check = false;
			else if (st.top() == '[') 
			 st.pop();
		}
	}
	if (st.empty() == 0) check = false;
	if (check == true) cout << "YES";
	else cout << "NO";
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
