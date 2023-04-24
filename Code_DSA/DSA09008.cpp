#include <iostream>
#include <vector>
#include <cstring>

using namespace std;

const int MAX = 1005;

vector<int> graph[MAX];
bool visited[MAX];

void DFS(int u) {
    visited[u] = true;
    for (int v : graph[u]) {
        if (!visited[v]) {
            DFS(v);
        }
    }
}

int TPLT_DFS(int n) {
    int cnt = 0;
    memset(visited, false, sizeof(visited));
    for (int i = 1; i <= n; i++) {
        if (!visited[i]) {
            DFS(i);
            cnt++;
        }
    }
    return cnt;
}

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n, m;
        cin >> n >> m;
        for (int i = 1; i <= n; i++) {
            graph[i].clear();
        }
        for (int i = 0; i < m; i++) {
            int u, v;
            cin >> u >> v;
            graph[u].push_back(v);
            graph[v].push_back(u);
        }
        cout << TPLT_DFS(n) << endl;
    }
    return 0;
}

