#include<bits/stdc++.h>
using namespace std;

void process()
{
	int i;
	string s;
	string arr[1001];
	stack<char> st;
	stack<int> vt;
	cin >> s;
	for (i = 0; i < s.length(); i++)
	{
		if (s[i] == '(')
		{
			st.push(s[i]);
			vt.push(i);
		}
			
		else if (s[i] == ')')
		{
			if (st.empty() == 1)
				arr[i] = "-1"; 
			else if (st.top() == '(')
			{
				arr[i] = "1";
				arr[vt.top()] = "0";
				st.pop();
				vt.pop();
			}
		}
	}
	if (st.empty() == 0) 
	{
		for (i = 0; i < vt.size(); i++)
			arr[i] = "-1";
	}
	for (i = 0; i < s.length(); i++)
		if (arr[i] != "-1" && arr[i] != "0" && arr[i] != "1")
			arr[i] = s[i];
	for (i = 0; i <s.length(); i++)
		cout << arr[i];
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
