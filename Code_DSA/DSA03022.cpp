#include<bits/stdc++.h>

using namespace std;

void process()	
{
	int n, i;
	cin >> n;
	int a[n + 5];
	for (i = 0; i < n; i++)
		cin >> a[i];
	sort(a, a + n);
	vector<int> res;
    res.push_back(a[0] * a[1]);
    res.push_back(a[n - 1] * a[n - 2]);
    res.push_back(a[0] * a[1] * a[n - 1]);
    res.push_back(a[n - 1] * a[n - 2] * a[n - 3]);
    sort(res.rbegin(), res.rend());
    cout << res[0];
	
}

int main()
{
	process();
}
