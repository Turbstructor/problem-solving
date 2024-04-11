#include<iostream>
using namespace std;

int main()
{
    int l, p, people[5], i;
    
    cin >> l >> p;
    for(i = 0; i < 5; i ++) cin >> people[i];
    for(i = 0; i < 5; i ++) cout << (people[i] - (l * p)) << " ";
    cout << "\n";
    
    return 0;
}