#include<bits/stdc++.h>

using namespace std;

void process(string s)
{
	int i;
	for (i = s.length() - 1; i >= 0; i--)
	{
		if (s[i] == '1') 
				s[i] = '0';
		else
		{
			s[i] = '1';
			break;
		}		
	}
	cout << s;
}

int main()
{
	int t;
	t =1;
	cin >> t;
	while (t--)
	{
		string s;
		cin >> s;
		process(s);
		cout << endl;
	}
}

