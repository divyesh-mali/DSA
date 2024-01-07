//print you are eligible if given age is over 18 and not eligible if the age is below 18,
// and print you just made it if the age is exactly 18

#include<iostream>
using namespace std;
int main()
{
    int age;

    cout << "Enter your age: ";
    cin >> age;
    if(age>0)
    {
        if(age>18)
        {
            cout << "You are eligible";
        }

        else if(age<18)
        {
            cout << "You are not eligible";
        }

        else 
        {
            cout << "You have just made it";
        } 
    }
    return 0;
}
