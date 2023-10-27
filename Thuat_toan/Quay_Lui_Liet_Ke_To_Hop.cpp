#include<bits/stdc++.h>

using namespace std;

int x[1000], n, k;

void Try(int m)
{
	if (m > k)
	{
		for (int i = 1; i <= k; i++)
			cout << x[i] << " ";
		cout << endl;
		return;
	}
	for (int i = x[m-1] + 1; i <= n - k + m; i++)
	{
		x[m] = i;
		Try(m+1);
	}
}

void LietKe(int x[], int n, int k)
{
	Try(1);
}

int main()
{
	cin >> n >> k;
	LietKe(x, n, k);
}
