#include<bits/stdc++.h>

using namespace std;

vector<int> adj[1000]; // danh sach ke
int n, m;
bool visited[1000];

void input()
{
	int i;
	// chuyen tu danh sach canh sang danh sach ke
	cin >> n >> m;    
	for (i = 0; i < m; i++)
	{
		int x, y;
		cin >> x >> y;
		adj[x].push_back(y);
		adj[y].push_back(x);
	}
	memset(visited, false, sizeof(visited));
}

void DFS(int u)
{
	cout << u << " ";
	visited[u] = true;
	for (int v : adj[u])
	{
		if (visited[v] == false)
			DFS(v);
	}
}
int main()
{
	ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    input();
    DFS(1);
}


