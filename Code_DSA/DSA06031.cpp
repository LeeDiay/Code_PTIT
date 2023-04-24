#include<bits/stdc++.h>

using namespace std;

void process()
{
	int n, t, i, k;
	cin >> t;
	while (t--)
	{
		cin >> n >> k;
		int a[n + 5];
		for (i = 1; i <= n; i++)
			cin >> a[i];
		i = 1;
		while (i <= n-k+1)
		{
			int temp = i;
			int max = -1e7;
			for (int j = i; j <= i + k -1 ; j++)
				if (a[j] > max) max = a[j];
			cout << max << " ";
			i = temp;
			i++;
		}
		cout << endl;
	}
}

int main()
{
	ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
	process();
}
