#include<bits/stdc++.h>

using namespace std;

void SinhToHop(int a[], int n, int k)
{
	for (int i = 1; i <= k; i++)
		a[i] = i;
	int ok = 0;
	while (ok != 1)
	{
		for (int i = 1; i <= k; i++)
			cout << a[i];
		cout << " ";
		int i = k;
		while (i > 0 && a[i] == n - k + i)
			i--;
		if (i == 0) 
			ok = 1;
		else 
		{
			a[i]++;
			for (int j = i + 1; j <= n; j++)
				a[j] = a[j - 1] + 1;
		}
	}
}

int main()
{
    int n, a[100000], t, k;
    cin >> t;
	while (t--)
	{
		cin >> n >> k; 
		SinhToHop(a, n, k);
		cout << endl;
	}
}
