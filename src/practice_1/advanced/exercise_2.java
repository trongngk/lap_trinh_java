package practice_1.advanced;

import java.util.Scanner;

public class exercise_2 {
    // nhap 2 so thuc a,b. in tong, hieu, tich, thuong
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so thuc a: ");
        float a = input.nextFloat();
        System.out.print("Nhap so thuc b: ");
        float b = input.nextFloat();
        System.out.println("Tong: " + (a + b));
        System.out.println("Hieu: " + (a - b));
        System.out.println("Tich: " + (a * b));
        System.out.println("Thuong: " + (a / b));
        input.close();
    }
}
