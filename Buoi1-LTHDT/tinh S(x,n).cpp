#include <cmath>
#include "iostream"

using namespace std;

int gt(int n) 
{
    if (n == 1 || n == 0) 
    {
        return 1;
    }
    return gt(n - 1) * n;
}

float tong(int x, int n, float s = 0) 
{
    if (n == 0) {
        return s;
    } else
        s += (pow(x,n))/ gt(n);// (x^n) chia cho giai thua thu n
//trong C++, pow(a, b) = a^b
    return tong(x,n - 1, s);
}

int main() 
{
    int x, n;
    cout << "Nhap x: ";
    cin >> x;
    cout << "Nhap n: ";
    cin >> n;
    cout<<"S("<<x<<","<<n<<") ="<<tong(x,n);
}