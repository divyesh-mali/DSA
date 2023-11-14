#include<iostream>
using namespace std;

int main()
{
    int n;
    cout << "Enter value of n: ";
    cin >> n;

    int row =1;
    while(row<=n)
    {
        
        int space = n-row;

        //Print spaces (triangle 1)
        while(space)
        {
            cout << " ";
            space--;
        }

        //Print triangle 2
        int col=1;
        while(col<=row)
        {
            cout << col;
            col++;
        }

        //Print triangle 3
        int start = row-1;
        while(start)
        {
            cout << start;
            start--;
        }

        cout << "\n";
        row++;
    }
    return 0;
}