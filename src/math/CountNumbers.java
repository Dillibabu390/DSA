package math;

public class CountNumbers {
    public static void main(String[] args) {
        int num = 121;

        int temp = num;
         int count =0;
        while (num !=0){
            int val = num%10;
            if (temp % val == 0){
                count++;
            }
            num /= 10;

        }

        System.out.println(count);

    }
}
