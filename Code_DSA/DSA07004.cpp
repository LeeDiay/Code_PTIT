#include<bits/stdc++.h>
using namespace std;

void solve(string a)
{
	int n = a.size();
	stack<int> st;
	int cnt1 = 0, cnt2 = 0;
	for(int i = 0; i< n; i++)
	{
		if(a[i] == '(')
		{
			st.push(a[i]);
			cnt1++;
		}
		else
		{
			if(!st.empty() && st.top() == '(')
			{
				st.pop();
				cnt1--;
			}
			else
			{
				cnt2++;
				st.push(a[i]);
			}
		}
	}
	
	int res = cnt1/2 + cnt2/2;
	res += cnt1%2 + cnt2%2;
	
	cout << res;
}

int main()
{
	ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    
	int t;
	cin >> t;
	while(t--)
	{
		string s;
		cin >> s;
		solve(s);
		cout << endl;
	}
}

