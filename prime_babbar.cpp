#include<iostream>
using namespace std;
int main()
{
    int n;
    cout << "Enter a number: ";
    cin >> n;

    int i = 2; // becoz prime nos start from 2

    while(i<n) // bezoz we want to check if n is divisible with nos between
    {          // i and n excluding the 'i' and 'n'
        if(n%i==0)
        {
            cout << "Number is not prime for " << i << "\n";
        }

        else
        {
            cout << "Number is prime for " << i << "\n";
        }
        i = i + 1;       
    }
    return 0;
}