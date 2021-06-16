#include<bits/stdc++.h>
using namespace std;

bool isPal(int n) {
    int temp = n;
    int rev = 0;
    while(temp != 0) {
        int x = temp%10;
        rev = rev*10 + x;
        temp=temp/10;
    }
    return (rev == n);
}

int main() {
    int n; cin>>n;

    bool res = isPal(n);
    cout<<res<<endl;

    return 0;
}