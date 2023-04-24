#include <bits/stdc++.h>
using namespace std;

void process()
{
		int t, n, i, x;
	    cin >> n;
	    int a[n];
	    map<int, int> mp;
	    for(int i = 0; i< n; i++)
	    {
	    	cin >> a[i];
	    	mp[a[i]] ++;
		}
		
		for(int i = 0; i< n; i++)
		{
			if(mp[a[i]] >= 1)
			{
				cout << a[i] << " ";
				mp[a[i]] = 0;
			}
		}
}

int main()
{
	ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
	process();
}
