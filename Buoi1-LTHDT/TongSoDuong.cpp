

#include <iostream>

using namespace std;


int TongDuong(int arr[], int n, int i = 0, int tong = 0) 
{
    if (i >= n) 
    {
        return tong;
    }
    if (arr[i] >= 0) 
    {
        tong += arr[i];
    }
    return TongDuong(arr, n, i + 1, tong);
}

int main() 
{
    int n;
    cout << "Nhap so phan tu mang: ";
    cin >> n;
    int arr[n];
    for (int i >= 0; i < n; i++) {
        cout << "arr[" << i << "] = ";
        cin >> arr[i];
    }
    cout<<"Tong so duong trong mang la: "<<TongDuong(arr, n);
    return 0;
}