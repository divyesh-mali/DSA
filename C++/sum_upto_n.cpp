#include<iostream>
using namespace std;
int main()
{
    int n;
    cout << "Enter number upto which you want to add: ";
    cin >> n;
    
    int sum = 0; //becoz initially we have sum zero
    int i = 1; // we start adding from 1 to n

    while(i<=n)
    {
        sum = sum + i; // we've to increment values of both sum 
        i = i+1;           // and i simultaneously
    }

    cout << "The sum upto " << n << " is: " << sum;
    return 0;
}