#include <iostream>
using namespace std;

int main(){
    int n;
    int m=0;
    bool flag = true;

    cout << "Enter Number: ";
    cin >> n;

    m = n/2;

    for(int i=2; i<=m; i++){ // best case if number is found to be divisible by 2
        if(n%i == 0){        // worst case if number is found to be divisible by m
            flag = false;
            cout << i << "\n";
            break;
        }
    }

    if(flag == true){
        cout << "Number is Prime!";
    }
    else{
        cout << "Number is Not Prime!";
    }

    return 0;
}