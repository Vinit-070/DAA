import java.util.*;
public class pr8 {
    static int min(int a, int b) {
        if (a > b) {
            return b;
        } else {
            return a;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of coins: ");
        int n = sc.nextInt();
        int i, j;
        int d[] = new int[n];
        System.out.print("Enter coins: ");
        for (i = 0; i < n; i++) {
            d[i] = sc.nextInt();
        }
        System.out.print("Enter total amount: ");
        int T = sc.nextInt();
        int c[][] = new int[n][T + 1];
        for (i = 0; i < n; i++) {
            c[i][0] = 0;
        }
        for (i = 0; i < n; i++) {
            for (j = 1; j <= T; j++) {
                if (i == 0) {
                    c[i][j] = 1 + c[0][j - d[0]];
                } else if (j < d[i]) {
                    c[i][j] = c[i - 1][j];
                } else {
                    c[i][j] = min(c[i - 1][j], 1 + c[i][j - d[i]]);
                }
            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j <= T; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Minimum number of coins: " + c[n - 1][T]);
    }
}