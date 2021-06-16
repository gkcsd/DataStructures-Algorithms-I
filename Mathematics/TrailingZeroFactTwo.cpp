#include<bits/stdc++.h>
using namespace std;

int trailZeroFact(int n) {
    int num = 0;
    for(int i = 5; i <= n; i=i*5) {
        num = num + n/i;
    }
    return num;
}

int main() {
    int n; cin>>n;

    int res = trailZeroFact(n);
    cout<<res<<endl;

    return 0;
}