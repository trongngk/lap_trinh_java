package practice_2.basic;

import java.util.Scanner;

public class exercise_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(Fibonaci(num));
        input.close();
}
    // ktra so ngto
    public static boolean prime(int n){
        if (n < 2) return false;
        for (int i = 2; i<= Math.sqrt(n); i++){
          if (n % i == 0){
            return false;
          }
        }
        return true;
      }
    // ktra so hoan hao
    public static boolean perfectNumber(int num){
        int sum = 0;
        for (int i = 1; i < num; i++){
            if (num % i == 0){
                sum += i;
            }
        }
        if (sum == num) return true;
        else return false;
    }
    // ktra so chinh phuong
    public static boolean squareNumber(int num) {
      if (Math.pow((int)(Math.sqrt(num)),2) == num) return true;
      else return false;
    }
    // fibonaci
    public static int Fibonaci(int n) {
      if (n < 0) return 0;
      else if (n == 0 || n == 1) return n;
      return Fibonaci(n-1) + Fibonaci(n-2);
    }
}
