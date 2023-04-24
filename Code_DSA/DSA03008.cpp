#include<bits/stdc++.h>
using namespace std;

int n;

struct data
{
	int fi, se;
};

data h[1009];

bool cmp(data a, data b)
{
	
	return a.se < b.se;
}

void process()
{
	int t;
	cin >> t;
	while (t--)
	{
		cin >> n;
		int i, j;
		for (i = 0; i < n; i++)
			cin >> h[i].fi;
		for (i = 0; i < n; i++)
			cin >> h[i]. se;
		
		sort(h, h + n, cmp);
		int res = 1;
		i = 0;
		for (j = 1; j <= n; j++)
			if (h[j].fi >= h[i].se)
			{
				res++;
				i = j;
			}
		cout << res << endl;
	}
}
int main()
{
	ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    process();
	
	
}

