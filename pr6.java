import java.util.Scanner;
import java.util.Arrays;
class pr6 {
 void insertionSort(int array[])
{
 int size = array.length;
 for (int step = 1; step < size; step++)
{
 int key = array[step];
 int j = step - 1;
 while (j >= 0 && key < array[j])
{
 array[j + 1] = array[j];
 --j;
 }
 array[j + 1] = key;
 }
 }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] data = new int[n];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
           
            data[i] = sc.nextInt();
        }
        pr6 is = new pr6();
        is.insertionSort(data);
        System.out.print("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }
}
