package practice_1.advanced;

import java.util.Scanner;

public class exercise_1 {
    // nhap so canh da giac, chieu dai cac canh, in ra chu vi
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so canh da giac: ");
        int n = input.nextInt(); // so canh
        int[] a = new int[n]; // mang chua cac canh
        System.out.println("Nhap chieu dai cac canh: ");
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        System.out.println("Chu vi da giac: " + sum);
        input.close();
    }
}
