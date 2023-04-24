#include <bits/stdc++.h>
using namespace std;

const int MAX = 1005;

vector<int> adj[MAX];
bool visited[MAX];
int parent[MAX];

void DFS(int u, int t) {
    visited[u] = true;
    for (int v : adj[u]) {
        if (!visited[v]) {
            parent[v] = u;
            DFS(v, t);
        }
    }
}

vector<int> getPath(int s, int t) {
    vector<int> path;
    if (!visited[t]) return path;
    for (int v = t; v != s; v = parent[v])
        path.push_back(v);
    path.push_back(s);
    reverse(path.begin(), path.end());
    return path;
}

int main() {
    int T;
    cin >> T;
    while (T--) {
        int V, E, s, t;
        cin >> V >> E >> s >> t;
        for (int i = 1; i <= V; i++)
            adj[i].clear(), visited[i] = false;
        for (int i = 1; i <= E; i++) {
            int u, v;
            cin >> u >> v;
            adj[u].push_back(v);
            adj[v].push_back(u);
        }
        DFS(s, t);
        vector<int> path = getPath(s, t);
        if (path.empty()) cout << "-1\n";
        else {
            for (int v : path)
                cout << v << " ";
            cout << "\n";
        }
    }
    return 0;
}

