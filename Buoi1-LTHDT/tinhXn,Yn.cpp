#include <iostream>
using namespace std;
int Xn(int);
int Yn(int);

int Xn(int n)
{
    if(n == 0)
        return 1;
    return Xn(n - 1) + Yn(n - 1);
}

int Yn(int n)
{
    if(n == 0)
        return 0;
    return 3*Xn(n - 1) + 2*Yn(n - 1);
}

int main()
{
    int n;
    cout << "Nhap n: ";
    cin >> n;

    long kq1 = Xn(n);
    long kq2 = Yn(n);

    cout << "X(n) = " << kq1 << ", Y(n) = " << kq2 << endl;

    return 0;
}