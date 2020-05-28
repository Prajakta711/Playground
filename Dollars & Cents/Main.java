#include<iostream>
using namespace std;
int main()
{
  int d1,c1,d2,c2,D,C;
  cin>>d1>>c1>>d2>>c2;
  D=d1+d2;
  C=c1+c2;
  while (C>100)
  {
   D=D+(C/100);
    C=C%100;
    break;
  }
  cout<<D<<"\n"<<C;
    
}