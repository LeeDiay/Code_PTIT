#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

int main() {
    int n;

    //cin >> n;
	string ngaySinh[50];
    // Xóa b? d?u "/" t? m?i ngày sinh
    for (int i = 0; i < 28; ++i) {
        
        cin >> ngaySinh[i];

        // Lo?i b? d?u "/"
        ngaySinh[i].erase(remove(ngaySinh[i].begin(), ngaySinh[i].end(), '/'), ngaySinh[i].end());

        cout << ngaySinh << endl;
    }
    for (int i = 0; i < 24; ++i) {
        
        //cin >> ngaySinh;

        // Lo?i b? d?u "/"
        //ngaySinh.erase(remove(ngaySinh.begin(), ngaySinh.end(), '/'), ngaySinh.end());

        cout << ngaySinh[i] << endl;
    }

    return 0;
}

