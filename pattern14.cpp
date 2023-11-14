#include<iostream>
using namespace std;

int main()
{
    int n;
    cout << "Enter a number: ";
    cin >> n;

    char ch='A';
    int row=1; 
    while(row<=n)
    {
        int col=1;
        while(col<=row)
        {
            cout << ch << " "; 
            ch++;
            col++;
        }
        cout << "\n";
        row++;

    }
    return 0;
}