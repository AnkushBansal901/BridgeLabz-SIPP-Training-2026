public class MathWizard {

    int result = 0;

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) result *= i;
        return result;
    }

    static double factorial(double n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    static long fibonacci(int n) {
        if (n <= 1) return n;
        long a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            long temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static long lcm(int a, int b) {
        return (long) a / gcd(a, b) * b;
    }

    static long power(int base, int exp) {
        long res = 1;
        for (int i = 0; i < exp; i++) res *= base;
        return res;
    }

    void demonstrateScope() {
        int result = 99;
        System.out.println("Local result    : " + result);
        System.out.println("Instance result : " + this.result);
    }

    public static void main(String[] args) {
        System.out.println("isPrime(17)     : " + isPrime(17));
        System.out.println("factorial(5)    : " + factorial(5));
        System.out.println("factorial(5.0)  : " + factorial(5.0));
        System.out.println("fibonacci(10)   : " + fibonacci(10));
        System.out.println("gcd(48, 18)     : " + gcd(48, 18));
        System.out.println("lcm(4, 6)       : " + lcm(4, 6));
        System.out.println("power(2, 10)    : " + power(2, 10));

        System.out.println();
        new MathWizard().demonstrateScope();
    }
}
