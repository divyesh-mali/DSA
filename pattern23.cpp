// refer comments at bottom for understanding
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
        int space = n - i;
        while(space)
        {
            cout << " ";
            space--;
        }

        int j = 1;
        while(j<=i)
        {
            cout << ;
            j++;
        }
        cout << "\n";
        i++;
    }
    
    return 0;
}
//==========================================================


/* Output:
//Space = n-i
Enter a number: 4
   *  here, space = 4-1=3
  **        space = 4-2=2
 ***        space = 4-3=1
****        space = 4-4=0

*/