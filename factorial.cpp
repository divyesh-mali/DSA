// Progra to print factorial of a number

#include<iostream>
using namespace std;
int main()
{
    int fact=1, i=1, n;
    cout << "Enter number to find factorial: ";
    cin >> n;

    while(i <= n)
    {
        fact = fact * i;
        i++;
    }
    cout << "The factorial is: " << fact;
}