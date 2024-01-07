#include<iostream>
using namespace std;
int main()
{
    int n;
    cout << "Enter a number: ";
    cin >> n;

    int i=1; // initialise with 1 becoz we've to print pattern from 1
    
    while(i<=n)
    {
        int j=1;
        
        while(j<=i)
        {
           cout << i-j+1 << " ";    
           j++;

        }
        cout << "\n";
        i++;
    }
    

    return 0;
}