import java.util.*;
public class pr3{
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
        System.out.print("Number of elements in array is :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Array elements are :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element to be searched :  ");
        int target = sc.nextInt();
int index = sequentialSearch(arr, target);
if (index != -1) {
System.out.println("Element found at index: " + index);
} else {
System.out.println("Element not found in the array.");
}
}
public static int sequentialSearch(int[] arr, int target) {
int n = arr.length;
for (int i = 0; i < n; i++) {
if (arr[i] == target) {
return i;
}
}
return -1;
}
}
