#include<bits/stdc++.h> 

using namespace std; 

void process()
{
	int i, t;
	cin >> t;
	string s;
	while (t--)
	{
		cin.ignore();
		cin >> s;
		int count = 1;	
		for (i = 0; i < s.length(); i++)
		{
			if (s[i] == s[i+1]) count ++;
			else 
			{
				cout << s[i] << count;
				count = 1;
			}
		}	cout << endl;
	}	
}

int main() 
{ 
	process();
}
