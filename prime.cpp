// UNDERSTAND THIS CODE PROPERLY !!!

#include <iostream>  
using namespace std;  
int main()  
{  
  int n, i, m=0, flag=0;  
  cout << "Enter the Number to check Prime: ";  
  cin >> n;  
  m=n/2;  
  for(i = 2; i <= m; i++)  
  {  
      if(n % i == 0)  
      {  
          cout<<"Number is not Prime."<<endl;  
          flag=1;  
          break;  
      }  
  }  
  if (flag==0)  
      cout << "Number is Prime."<<endl;  
  return 0;  
} 










// #include<iostream>
// using namespace std;
// int main()
// {
//     int n, div = 2;
//     cout << "Enter a number: ";
//     cin >> n;

//     while(div<2)
//     {
//         if(n % div==0)
//         {
//             cout <<"The number is not prime !!";
//         }

//         else
//         {
//             div = div+1;
//         }

//         cout << "Number is prime :)";
//     }


//     return 0;
// }


 
