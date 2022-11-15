#include<iostream>

using namespace std;

int main()
{
    long long tc, n, i, sum;
    cin>>tc;
    for (i = 1; i <= tc; i++)
    {
        cin >> n;
        sum = (1 + n) * n / 2;
        cout << sum << endl;
    }
}
