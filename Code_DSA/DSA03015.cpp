#include<bits/stdc++.h>

using namespace std;

void process()	
{
	int n, s, m, t;
	cin >> t;
	while (t--)
	{
		cin >> n >> s >> m;
		if (n < m || 6 * (n - m) < m)
			cout << "-1" << endl;
		else cout << ceil((float) m * s / n) << endl;
		
	}
}

int main()
{
	process();
}
