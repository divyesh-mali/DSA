/* Method 1: by using 'value' variable

#include<iostream>
using namespace std;
int main()
{
    int n;
    cout << "Enter a number: ";
    cin >> n;

    int row=1; // initialise with 1 becoz we've to print pattern from 1
    while(row<=n)
    {
        int col=1;
        int value=row; //initialize with value of row becoz we want to print value
                       // of row but we dont wanna alter value of row 
        while(col<=row)
        {
           cout << value << " ";   
           value++;  
           col++;

        }
        cout << "\n";
        row++;
    }
    

    return 0;
}
*/


// Method 2: without using 'value' variable
#include<iostream>
using namespace std;
int main()
{
    int n;
    cout << "Enter a number: ";
    cin >> n;

    int row=1; // initialise with 1 becoz we've to print pattern from 1
    while(row<=n)
    {
        int col=1;
        while(col<=row)
        {
           cout << row + col - 1 << " ";     
           col++;

        }
        cout << "\n";
        row++;
    }
    

    return 0;
}