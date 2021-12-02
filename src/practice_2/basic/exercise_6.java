package practice_2.basic;

import java.util.Scanner;

public class exercise_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = input.nextInt();
        System.out.println(sum(n));
        System.out.println(sum_1(n));
        System.out.println(sum_2(n));
        System.out.println(sum_3(n));
        input.close();
    }
    //S=1+2-3+……(-1)n+1.n
    public static int sum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(-1, i+1) * i;
        }
        return sum;
    }
    // S=1!+2!+3!+……+n!
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
        
    }
    public static int sum_1(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++){
            result += factorial(i);
        }
        return result;
    }
    //Nhập n, nếu n lẻ : tính tổng các số lẻ <n, nếu n chẵn: tính tổng các số chẵn <n
    public static int sum_2(int n) {
        int result = 0;
        if (n % 2 == 0) {
            for (int i = 0; i < n; i += 2) {
                result += i;
            }
        } else {
            for (int i = 1; i < n; i += 2) {
                result += i;
            }
        }
        return result;
    }
    // S = 1/2 + 2/3 + 3/4 + … + n-1/n
    public static double sum_3(int n) {
        double result = 0;
        for (int i = 1; i < n; i++) {
            result += (double) i / (double) (i + 1);
        }
        return result;
    }
}
