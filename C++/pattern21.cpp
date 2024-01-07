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
        int space = i-1;
        while(space)
        {
            cout << " ";
            space--;
        }

        int j = 1;
        int count=i-j+1;  //100 IQ lag gaya bhai
        while(j<=(n-i+1))
        {
         
            cout << count; // iss count ke logic ko lagane me
            count++;       // I guess my logical thinking is developing
            j++;
        }
        cout << "\n";
        i++;
    }
    
    return 0;
}