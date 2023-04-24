#include <bits/stdc++.h>
using namespace std;

bool cmp(pair<int, int> a, pair<int, int> b) {
    if (a.second == b.second)
        return a.first > b.first;
    return a.second < b.second;
}

void process() 
{
    int n; 
	cin >> n;
    vector<pair<int, int>> a(n);
    for (int i = 0; i < n; ++i) 
	{
        cin >> a[i].first >> a[i].second;
    }
    sort(a.begin(), a.end(), cmp);
    int res = 1, now = a[0].second;
    for (int i = 1; i < n; ++i) 
	{
        if (a[i].first >= now) 
		{
            res++;
            now = a[i].second;
        }
    }
    cout << res;
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);

    int t;
    cin >> t;
    while (t--) 
	{
        process();
        cout << endl;
    }
    return 0;
}
