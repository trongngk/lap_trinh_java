package practice_2.advanced;

import java.util.Scanner;

public class exercise_1 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = ip.nextInt();
        System.out.print("Nhap x: ");
        int x = ip.nextInt();
        System.out.print("Nhap k: ");
        int k = ip.nextInt();
        double Sum = 0;
        for (int i = 1; i <= n; i++) {
            Sum += factorial(i) / (Math.pow(x, i) + Math.pow(-1, i+1)*Math.pow(k,i));
        }
        System.out.println("Ket qua: " + Sum);
        ip.close();  
    }
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n*factorial(n-1);
        
    }

}
