#include<iostream>
using namespace std;

int main()
{
    int n;
    cout << "Enter a number: ";
    cin >> n;

    char ch;
    int row=1; 
    while(row<=n)
    {
        int col=1;
        while(col<=row)
        {
            ch = 'A' + row + col - 2;
            cout << ch << " "; 
            ch++;
            col++;
        }
        cout << "\n";
        row++;

    }
    return 0;
}