#include<bits/stdc++.h>
using namespace std;

int factRecurSol(int n) {
    if(n == 0)
        return 1;
    return n * factRecurSol(n-1);
}

int main() {
    int n; cin>>n;

    int res = factRecurSol(n);

    cout<<res<<endl;

    return 0;
}