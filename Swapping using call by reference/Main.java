#include<iostream>
using namespace std;
int swap (int r1, int &r2)
{
  r1=r2;
  r2=r1;
}
int main()
{
  int a,b;
  cin>>a>>b;
  cout<<"Before swapping a= "<<a<<" "<<"and b="<<b<<endl;
  swap(a,b);
  cout<<"After swapping a= "<<b<<" "<<"and b="<<a;
}

  
  