#include<bits/stdc++.h>

using namespace std;

int v, e;
bool visited[1000];
vector<int> ke[1000];

void input()
{
	cin >> v >> e;
	for (int i = 1; i <= e; i++)
	{
		int x, y;
		cin >> x >> y;
		ke[x].push_back(y);
		ke[y].push_back(x);
	}
	memset(visited, false, sizeof(visited));
}

void BFS(int u)
{
	queue<int> q;
	q.push(u);
	visited[u] = true;
	while (q.empty() == false)
	{
		int v = q.front();
		q.pop();
		cout << v << " ";
		for (int x : ke[v])
			if (visited[x] == false)
			{
				q.push(x);
				visited[x] = true;
			}
	}
}

int main()
{
	ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
   	input();
   	BFS(1);
}


