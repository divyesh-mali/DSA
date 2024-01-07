// refer comments at bottom for understanding SPACES
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
        int count = i;
        while(j<=i)
        {
            cout << count;
            count++;
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
  **        space = 3-1=2
 ***        space = 2-1=1
****        space = 1-1=0

*/

