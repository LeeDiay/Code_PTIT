#include<bits/stdc++.h>

using namespace std;

void XnpKt(int a[], int n, int k)
{
	int dem = 0;
	for (int i = 1; i <= n; i++)
		a[i] = 0;
	int ok = 0;
	while (ok != 1)
	{
		if (dem % k == 0)
		{
			for (int i = 1; i <= n; i++)
				cout << a[i];
			cout << endl;
		}
		dem++;
		int i = n;
		while (i > 0 && a[i] == 1)
		{
			a[i] = 0;
			i--;
		}
		if (i == 0) 
			ok = 1;
		else a[i] = 1;
	}
}

int main()
{
    int n, a[100000], t, k;
	cin >> n >> k; 
	XnpKt(a, n, k);
	cout << endl;
}
