#include<iostream>
using namespace std;
int main()
{
    int n;
    cout << "Enter a number: ";
    cin >> n;

    int i=1; // initialise with 1 becoz we've to print pattern from 1
    int count=1;
    while(i<=n)
    {
        int j=1;
        while(j<=n)
        {
           cout << count << " "; 
           count++;
           j++;
        }
        cout << "\n";
        i++;
    }
    

    return 0;
}