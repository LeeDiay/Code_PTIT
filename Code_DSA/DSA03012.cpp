#include<bits/stdc++.h>

using namespace std;

void check(string s)
{
	int a[1000] = {0};
	int lon = -1e6;
	int i;
	for (char i : s)
	{
		a[i] ++;
		lon = max(lon, a[i]);
	}
	if (lon <= (s.length() + 1) / 2) cout <<  1;
	else cout << -1;
	
}

void process()
{
	int  t, k;
    cin >> t;
    string s;
	while (t--)
	{
		cin >> s;
		check(s);
		cout << endl;
	}
}

int main()
{
	ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    process();
}



