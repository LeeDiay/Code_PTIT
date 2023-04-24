#include <bits/stdc++.h>
using namespace std;

const int MOD = 1e9 + 7;

long long poww(long long n, long long k) {
    if (k == 0) return 1;
    if (k == 1) return n;
    long long x = poww(n, k / 2);
    long long y = (x * x) % MOD;
    if (k % 2 == 0) return y;
    return (n * y) % MOD;
}

void testCase() {
    long long n, k;
    for (int i = 1; i <= 25; i++)
    {
    	cin >> n >> k;
    	if (n == 0 && k == 0)
    		break;
    cout << poww(n, k) << endl;
	}
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    
        testCase();
        cout << "\n";
}
