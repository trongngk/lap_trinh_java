package practice_2.basic;

import java.util.Scanner;

public class exercise_2 {
    // in ra gia tri nhi phan cua 1 so cho truoc
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so n: ");
        int n = input.nextInt();
        System.out.print(Integer.toBinaryString(n));
        input.close();
    }
}
