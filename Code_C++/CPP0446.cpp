#include <bits/stdc++.h>

using namespace std;

void TestCase()
{
    int n;
    cin >> n;
    int a[n];
    for (auto &x : a) cin >> x;
    int res = 2 * 1e6;
    for (int i = 0; i + 1 < n; ++i) 
	{
        for (int j = i + 1; j < n; ++j) 
		{
            if (abs(a[i] + a[j]) < abs(res))
                res = a[i] + a[j];
        }
    }
    cout << res << endl;
}

int main()
{
    int T;
    cin >> T;
    while (T--) TestCase();
    return 0;
}
