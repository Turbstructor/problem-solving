#include<iostream>

using namespace std;

int main()
{
    int x, b;

    cin >> x;
    for(b = 0; x > 0; x /= 2) b += (x % 2);

    cout << b << "\n";

    return 0;
}