package math;

public class PivotNumber {
    public static void main(String[] args) {

        int num = 8;
        int right_sum = num* (num+1)/2;

        int left_sum =0;
        for (int i=1 ;i<=num ;i++){

            right_sum = right_sum -i;
            if (right_sum == left_sum){
                System.out.println(i);
            }
            left_sum = left_sum +i;

        }













    }
}
