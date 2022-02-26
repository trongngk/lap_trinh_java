package practice_4.basic;


public class exercise_1 {
    public static int number = Integer.parseInt(System.console().readLine());

    public static void main(String[] args) {
        System.out.println(number + " is prime number: " + checkPrime(number));
        System.out.println(number + " is perfect number: " + checkPerfectNumber(number));
        System.out.println(number + " is square number: " + checkSquareNumber(number));
        System.out.println(number + "th in Fibonaci is: " + Fibonaci(number));
    }

    // 1. check if n is prime number
    public static boolean checkPrime(int n){
        if (n < 2) return false;
        for (int i = 2; i<= Math.sqrt(n); i++){
        if (n % i == 0){
            return false;
        }
        }
        return true;
    } 
    // 2. check if n is perfect number
    public static boolean checkPerfectNumber(int num){
        int sum = 0;
        for (int i = 1; i < num; i++){
            if (num % i == 0){
                sum += i;
            }
        }
        if (sum == num) return true;
        else return false;
    }
    //  3. check if n is square number
    public static boolean checkSquareNumber(int num) {
        if (Math.pow((int)(Math.sqrt(num)),2) == num) return true;
        else return false;
      }
    // 4. FIbonacci number
    public static int Fibonaci(int n) {
        if (n < 0) return 0;
        else if (n == 0 || n == 1) return n;
        return Fibonaci(n-1) + Fibonaci(n-2);
    }
     // 5. S = 1/2 + 2/3 + 3/4 + … + n-1/n
    public static double sum(int n) {
        double result = 0;
        for (int i = 1; i < n; i++) {
            result += (double) i / (double) (i + 1);
        }
        return result;
    }
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    public static double sum_2(int n,int x, int k) {
        double Sum = 0;
        for (int i = 1; i <= n; i++) {
            Sum += factorial(i) / (Math.pow(x, i) + Math.pow(-1, i+1)*Math.pow(k,i));
        }
        return Sum;
    }
}