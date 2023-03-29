//tinh tong so chan dung de quy
#include <iostream>
using namespace std;

int TongSoChan(int arr[], int n, int i = 0, int tong = 0) {
    if (i >= n) 
    {
        return tong;
    }
    if (arr[i] % 2 == 0) 
    {
        tong += arr[i];
    }
    return TongSoChan(arr, n, i + 1, tong);
}

int main() 
{
    int n;
    cout << "Nhap so phan tu mang: ";
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++) {
        cout << "arr[" << i << "] = ";
        cin >> arr[i];
    }
    cout<<"Tong so chan trong mang la: "<<TongSoChan(arr, n);
    return 0;
}

