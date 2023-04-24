#include<bits/stdc++.h>
using namespace std;

void process()
{
	int n, i;
	cin >> n;
	int a[n], res[n];
	stack<int> st;
	for (i = 0; i < n; i++)
		cin >> a[i];
	for (i = n - 1; i >= 0; i--)
	{
		while (st.empty() == 0 && st.top() <= a[i])
			st.pop();
		if (st.empty() == 1)
			res[i] = -1;
		else res[i] = st.top();
		st.push(a[i]);
	}
	for (auto i : res)
		cout << i << " ";
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
