/* Method 1: Complicated formula

#include<iostream>
using namespace std;

int main()
{
    int n;
    cout << "Enter a number: ";
    cin >> n;

    int row=1; 
    while(row<=n)
    {
        int col = 1;
// i+j-1+'A'-1 = 1+'A'-1
// 'A'+i+j-2 = 'A' ---> formula
        while(col<=n)
        {
            char ch = 'A' + row + col - 2;
            cout << ch << " "; 
            ch++; 
            col++;
        }
        cout << "\n";
        row++;
    }    

    return 0;
}
*/

//===========================================================================



//Method 2 : 'Start' Method

#include<iostream>
using namespace std;

int main()
{
    int n;
    cout << "Enter a number: ";
    cin >> n;

    int row=1; 
    while(row<=n)
    {
        char start = 'A' + n - row;
        int col = 1;
        while(col<=n)
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