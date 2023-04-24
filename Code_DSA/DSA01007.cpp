#include<bits/stdc++.h>

using namespace std;

void SinhNhiPhan(string s, int n)
{
	int i; 
	for (i = 1; i <= n; i++)
		s[i] = 'A';
	while (1)
	{
		for (i = 1; i <= n; i++)
		cout << s[i];
		cout << " ";
		i = n;
		while (i > 0 && s[i] == 'B')
		{
			s[i] = 'A';
			i--;
		}
		if (i == 0)
			return;
		else s[i] = 'B';
	}
}

int main()
{
	int t, n;
	string s;
	cin >> t;
	while (t--)
	{
		cin >> n;
		SinhNhiPhan(s, n);
		cout << endl;
	}
}
