#include<bits/stdc++.h>

using namespace std;

bool vs[100];
int a[1000];
int n;
void solve()
{
	for (int i = 1; i < n; i++)
		if (abs(a[i+1] - a[i]) == 1)
			return;
	for (int i = 1; i <= n; i++)
		cout << a[i];
	cout << endl;
}


void Try(int i)
{
	for (int j = 1; j <= n; j++)
	{
		if (!vs[j])
		{
			vs[j] = true; 
			a[i] = j;
			if (i == n) 
				solve();
			else Try(i + 1);
			vs[j] = false;
		}
	}
}

int main()
{
	ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int  t, k;
    cin >> t;
	while (t--)
	{
		cin >> n; 
		memset(vs, false, sizeof(vs));
		Try(1);
	}
}


