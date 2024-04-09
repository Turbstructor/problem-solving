#include<iostream>
using namespace std;

int main()
{
    int a, b, c, d;
    
    cin >> a >> b >> c;
    cin >> d;
    
    c += d;
    if(c >= 60){ b += (c / 60); c %= 60; }
    if(b >= 60){ a += (b / 60); b %= 60; }
    if(a >= 24) a %= 24;
    
    cout << a << " " << b << " " << c << "\n";
    
    return 0;
}