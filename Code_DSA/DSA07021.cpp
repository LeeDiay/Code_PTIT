#include<bits/stdc++.h>
using namespace std;

void process()
{
	int i;
	string s;
	stack<int> st;
	cin >> s;
	int ans = 0;
	int n = s.length();
	st.push(-1);
	for (i = 0; i < n; i++)
	{
		if (s[i] == '(')
			st.push(i);
		else
		{
			st.pop();
			if (st.empty() == 0)
				ans = max(ans, i - st.top());
			else st.push(i);
		}
	}
	cout << ans;
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
