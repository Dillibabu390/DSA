package math;

public class HappyNumber {
    public static void main(String[] args) {
        
        int num =19;

        int temp =0;

        int sum =0;
        while (num !=0) {
            int rem =num % 10;
            sum = sum+rem*rem;
            num = num/10;
        }
        num =sum;


        System.out.println(sum);

    }
}
