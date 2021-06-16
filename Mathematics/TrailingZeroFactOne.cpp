#include<bits/stdc++.h>
using namespace std;

int trailZeroFact(int n) {
    int fact = 1;
    for(int i = 2; i <= n; i++) {
        fact = fact * i;
    }
    int count = 0;
    while(fact%10 == 0) {
        count++;
        fact=fact/10;
    }
    return count;
}

int main() {
    int n; cin>>n;

    int res = trailZeroFact(n);
    cout<<res<<endl;

    return 0;
}