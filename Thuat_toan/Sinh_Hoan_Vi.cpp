#include<bits/stdc++.h>

using namespace std;

void SinhHoanVi(int a[], int n)
{
	for (int i = 1; i <= n; i++)
		a[i] = i;
	int ok = 0;
	while (ok != 1)
	{
		for (int i = 1; i <= n; i++)
			cout << a[i];
		cout << " ";
		int i = n - 1;
		while (i > 0 && a[i] > a[i + 1])
			i--;
		if (i == 0) 
			ok = 1;
		else 
		{
			int j = n;
			while (a[j] < a[i])
				j--;
			swap(a[j], a[i]);
			int l = i + 1, r = n;
			while (l < r)
			{
				swap(a[l], a[r]);
				l++;
				r--;
			}
		}
	}
}

int main()
{
    int n, a[100000], t, k;
    cin >> t;
	while (t--)
	{
		cin >> n; 
		SinhHoanVi(a, n);
		cout << endl;
	}
}
