#include<iostream>
using namespace std;
int main()
{
    int a = 2, b = 3;

    // 1 ---> True && 0 ---> False

    bool first = (a==b);
    cout << first << "\n";

    bool second = (a>b);
    cout << second << "\n";

    bool third = (a<b);
    cout << third << "\n";

    bool fourth = (a>=b);
    cout << fourth << "\n";

    bool fifth = (a<=b);
    cout << fifth << "\n";

    bool sixth = (a!=b);
    cout << sixth << "\n";

    return 0;
}