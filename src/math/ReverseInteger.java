package math;

public class ReverseInteger {
    public static void main(String[] args) {
        // https://leetcode.com/problems/reverse-integer/

        int num = 123;
        int temp = num;

        int sum = 0;

        while (num > 0){
            int rem = num%10;
            num = num/10;
            sum = sum * 10 + rem;
        }


        System.out.println(sum);


    }
}
