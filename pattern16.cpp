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
        char start = 'A' + n - row;
        while(col<=row)
        {
            
            cout << start << " "; 
            start++;
            col++;
        }
        cout << "\n";
        row++;

    }
    return 0;
}