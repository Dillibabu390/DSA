package math;

public class ProductAndSubract {
    public static void main(String[] args) {
        int n = 234;
        int sum =0;
        int prod = 1;
        while(0 < n){
            int rem = n % 10;
            sum = sum + rem;
            prod = prod * rem;

            n = n / 10;
        }
        System.out.println(prod - sum);
    }
}
