package math;

public class Gcd {
        public static int gcd(int a, int b) {
            while (b != 0) {
                int remainder = a % b;
                a = b;
                b = remainder;
            }
            return a;
        }

        public static void main(String[] args) {
            int num1 = 24;
            int num2 = 36;
            int result = gcd(num1, num2);
            System.out.println("GCD of " + num1 + " and " + num2 + " is: " + result);

        }

}
