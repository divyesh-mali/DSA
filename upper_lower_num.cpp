//Program to check whether input is lowercase, uppercase or numeric
#include<iostream>
using namespace std;
int main()
{
    char ch;
    cout << "Enter a character/number: ";
    cin >> ch;

    if(ch >= 65  && ch <= 90)   // A to Z
    {
        cout << "The input letter is upper case.";
    }

    else if(ch >= 97 && ch <= 122)  // a to z
    {
        cout << "The input letter is lower case.";
    }

    else if(ch >= 48 && ch <= 57)   // 0 to 9
    {
        cout << "The input is numeric.";
    }

    else
    {
        cout << "The input is neither uppercase, lowercase or numeric !!";
    }

    return 0;
}