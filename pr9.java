import java.util.*;
public class pr9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Matrix-1: ");
        int a11 = sc.nextInt();
        int a12 = sc.nextInt();
        int a21 = sc.nextInt();
        int a22 = sc.nextInt();
        System.out.println("Matrix-2: ");
        int b11 = sc.nextInt();
        int b12 = sc.nextInt();
        int b21 = sc.nextInt();
        int b22 = sc.nextInt();
        calculate(a11, a12, a21, a22, b11, b12, b21, b22);
    }
    public static void calculate(int a11, int a12, int a21, int a22, int b11, int b12, int b21, int b22) {
        int S1 = (a11 + a22) * (b11 + b22);
        int S2 = (a21 + a22) * b11;
        int S3 = a11 * (b12 - b22);
        int S4 = a22 * (b21 - b11);
        int S5 = (a11 + a12) * b22;
        int S6 = (a21 - a11) * (b11 + b12);
        int S7 = (a12 - a22) * (b21 + b22);
        int C1 = S1 + S4 - S5 + S7;
        int C2 = S3 + S5;
        int C3 = S2 + S4;
        int C4 = S1 + S3 - S2 + S6;
        System.out.println("Ans : ");
        System.out.println(C1 + " " + C2);
        System.out.println(C3 + " " + C4);
    }
}
