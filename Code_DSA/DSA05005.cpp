#include<bits/stdc++.h>

using namespace std;

void process()
{
	int n;
	cin >> n;
	int a[1009];
	int L[1009] = {1};
	for (int i = 0; i < n; i++)
	{
		L[i] = 1;
		cin >> a[i];
	}
		
	for (int i = 0; i < n; i++)
	{
		for (int j = 0; j < i; j++)
			if (a[i] >= a[j])
				L[i] = max(L[i], L[j] + 1);
	}
	sort(L, L + n);
	cout << n - L[n-1];
}

int main()
{
	ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int t;
    cin >> t;
    while (t--)
    {
    	process();
    	cout << endl;
	}
}




