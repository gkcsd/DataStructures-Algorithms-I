#include<bits/stdc++.h>
using namespace std;

int factOfNo(int n) {
    int fact = 1;
    for(int i = 2; i <= n; i++) {
        fact*=i;
    }
    return fact;
}

int main() {
    int n; cin>>n;

    int res = factOfNo(n);
    cout<<res<<endl;

    return 0;
}