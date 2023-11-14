// Maybe this code has some problem even though it works 
// count the number of spaces after taking output

#include<iostream>
using namespace std;

int main()
{
    int n;
    cout << "Enter a number: ";
    cin >> n;
    
    int i = 1;
    while(i<=n)
    {
        int space = i+1;
        while(space)
        {
            cout << " ";
            space--;
        }

        int j = 1;
        while(j<=(n-i+1))
        {
            cout << "*";
            j++;
        }
        cout << "\n";
        i++;
    }
    
    return 0;
}