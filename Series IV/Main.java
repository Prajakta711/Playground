#include<iostream>
using namespace std;
int main()
{
  int a,b,n,i;
  cin>>n;
  for(i=1;i<=n;i++)
  {
    a=(i*i)-1;
    b=(i*i)-2;
    if (i%2==0)
    {
      cout<<b<<" ";
    }
    else
    {
      cout<<a<<" ";
    }
  }
}
