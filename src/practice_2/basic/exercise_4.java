package practice_2.basic;
import java.lang.Math;
import java.util.Scanner;
public class exercise_4 {
    // tim so nguyen to nho hon so n
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = input.nextInt();
        System.out.println(prime(n));
        System.out.println("su dung vong lap for");
        for (int i = 2; i <= n; i++){
          if (prime(i))
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("su dung vong lap while");
        int obj = 2;
        while(obj <= n){          
          if (Prime(obj))
            System.out.print(obj + " ");
          obj++;
        }
        System.out.println();
        System.out.println("su dung vong lap do-while");
        int j = 2;
        do{
          if (snt(j))
            System.out.print(j + " ");
          j++;
        }while( j<= n);
        input.close();
    }
    // for
    public static boolean prime(int n){
      if (n < 2) return false;
      for (int i = 2; i<= Math.sqrt(n); i++){
        if (n % i == 0){
          return false;
        }
      }
      return true;
    }
    // while
    public static boolean Prime(int n){
      if (n < 2) return false;
      int i = 2;
      while (i <= Math.sqrt(n)){
        if (n % i == 0){
          return false;
        }
        i++;
      }
      return true;
    }

    //do-while
    public static boolean snt(int n){
      if (n < 2 ) return false;
      if (n == 2) return true;
      int i = 2;
      do{
        if (n % i == 0){
          return false;
        }
        i++;
      }while(i <= Math.sqrt(n));
      return true;
    }
}
