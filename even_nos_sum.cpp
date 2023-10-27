#include<iostream>
using namespace std;
int main()
{
    int n;
    cout << "Enter value of n: ";
    cin >> n;

    int i = 2;
    int sum = 0;

    while(i<=n)
    {
        if(i%2==0)
        {
            sum = sum + i;
        }
        i = i + 1;
    }

    cout << "Sum of even nos upto " << n << " is: " << sum;
    return 0;
}