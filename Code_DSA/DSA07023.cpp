#include<bits/stdc++.h>

using namespace std;

void process()
{
	int t;
	cin >> t;
	cin.ignore();
	while (t--)
	{
		
		string s, temp;
		getline(cin, s);
		stringstream ss(s);
		stack<string> john;
		while (ss >> temp)
		{
			john.push(temp);
		}
		while (john.empty() != true)
		{
			cout << john.top() << " ";
			john.pop();
		}
		cout << endl;
	}
}

int main()
{
	ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
   process();
}

