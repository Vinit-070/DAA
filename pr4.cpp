#include <iostream>
using namespace std;
int binarySearch(int arr[], int n, int x)
{
    int low = 0, high = n - 1;
    while (low <= high)
    {
        int mid = (low + high) / 2;
        if (arr[mid] == x)
            return mid;
        else if (arr[mid] < x)
            low = mid + 1;
        else
            high = mid - 1;
    }
    return -1;
}
int main()
{
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int n = sizeof(arr) / sizeof(arr[0]);
    int x = 5;
    int result = binarySearch(arr, n, x);
    if (result == -1)
        cout << "Element not found";
    else
        cout << "Element found at index " << result;
    // Best Case
    cout << "\nBest Case: ";
    int x1 = 5;
    result = binarySearch(arr, n, x1);
    if (result == -1)
        cout << "Element not found";
    else
        cout << "Element found at index " << result;
    // Average Case
    cout << "\nAverage Case: ";
    int x2 = 2;
    result = binarySearch(arr, n, x2);
    if (result == -1)
        cout << "Element not found";
    else
        cout << "Element found at index " << result;
    // Worst Case
    cout << "\nWorst Case: ";
    int x3 = 10;
    result = binarySearch(arr, n, x3);
    if (result == -1)
        cout << "Element not found";
    else
        cout << "Element found at index " << result;
    return 0;
}