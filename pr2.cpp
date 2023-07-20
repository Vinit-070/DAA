// Bubble sort algorithm to sort students based on their height
#include <iostream>
using namespace std;
void bubbleSort(int arr[], int n) {
    int i, j, temp;
    for (i = 0; i < n-1; i++) {
        for (j = 0; j < n-i-1; j++) {
            if (arr[j] > arr[j+1]) {
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}
int main() {
    int students[] = { 89, 42, 100, 93, 11, 234, 30, 82, 22, 75 };
    
    int n = sizeof(students) / sizeof(students[0]);
    cout<<"Unsorted Height : ";
    for (int i = 0; i < n; i++) {
        cout << students[i] << " ";
    }
    cout << endl;
    bubbleSort(students, n);
    
    cout<<"Sorted Height : ";
    for (int i = 0; i < n; i++) {
        cout << students[i] << " ";
    }
    cout << endl;

    return 0;
}