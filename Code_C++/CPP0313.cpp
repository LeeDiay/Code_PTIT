#include<bits/stdc++.h>

using namespace std;

void process()
{
	string s1, s2;
	getline(cin, s1);
	getline(cin, s2);
	string cmp;
	stringstream ss(s1);
	while (ss >> cmp)
	{
		if (cmp != s2) cout << cmp << " ";
	}
}

int main()
{
	process();
}
