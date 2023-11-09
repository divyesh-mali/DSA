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
        while(j<=n)
        {
            cout << n-j+1 << " ";   //cout << j << " "; use this formula
            j++;                    // to reverse the pattern printing
        }
        cout << "\n";
        i++;
    }
    return 0;
}