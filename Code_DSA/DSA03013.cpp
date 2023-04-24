#include<bits/stdc++.h>

using namespace std;

void process()
{
	int  t, k;
    cin >> t;
    string s;
	while (t--)
	{
		cin >> k >> s;
		int d[500] = {0};
		int Max = -1e6;
		for (int i = 0; i < s.size(); i++)
		{
			d[s[i]]++;
			if (Max < d[s[i]])
				Max = d[s[i]];
		}
		if ((Max - 1) * (k - 1) > s.size() - Max)
			cout << -1;
		else cout << 1;
		cout << endl;
	}
}

int main()
{
	ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    process();
}


