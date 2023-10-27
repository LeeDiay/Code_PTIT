#include<bits/stdc++.h>

using namespace std;

int x[1000], n, vs[1000];

void QLHoanVi(int m)
{
	int i;
	if (m > n)
	{
		for (i = 1; i <= n; i++)
			cout << x[i] << " ";
		cout << endl;
		return;
	}
	for (i = 1; i <= n; i++)
		if (vs[i] == 0)
		{
			x[m] = i;
			vs[i] = 1;
			QLHoanVi(m+1);
			vs[i] = 0;
		}
}

void LietKe(int x[], int n)
{
	for (int i = 1; i <= n; i++)
		vs[i] = 0;
	QLHoanVi(1);
}

int main()
{
	cin >> n;
	LietKe(x, n);
}
