import java.util.*;
public class pr5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of elements in array is :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Array elements are :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        quicksort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    static void quicksort(int[] arr, int low, int high) {
        if (low > high) {
            return;
        }
        int l = low;
        int h = high;
        int m = l + (h - l) / 2;
        int p = arr[m];
        int temp;
        while (l <= h) {
            while (arr[l] < p) {
                l++;
            }
            while (arr[h] > p) {
                h--;
            }
            if (l <= h) {
                temp = arr[l];
                arr[l] = arr[h];
                arr[h] = temp;
                l++;
                h--;
            }
        }
        quicksort(arr, low, h);
        quicksort(arr, l, high);
    }
}
