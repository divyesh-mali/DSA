#include<iostream>
using namespace std;
int main()
{
    float degree;
    cout << "Enter temperature in degree: ";
    cin >> degree;

    float farhenheit;
    farhenheit = (9*degree/5)+32;

    cout << "Temperature in farhenheit is: " << farhenheit;
    cin >> farhenheit;

    return 0;
}