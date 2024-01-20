package arrays;

public class PivotIndex {
    public static void main(String[] args) {

        int nums[] = {1,2,3};


     /*   int pivIndex = 0;

        for (int index = 0; index < nums.length; index++) {

            int left_sum = 0;
            for (int i = 0; i <=index; i++) {
                left_sum = left_sum + nums[i];
            }

            int right_sum = 0;
            for (int r = index; r <nums.length; r++) {
                right_sum = right_sum + nums[r];
            }

             if (left_sum == right_sum){
                 pivIndex =index;
             }

        }*/

        int right_sum = 0;
        int index =0;
        for (int i=0;i< nums.length;i++){
            right_sum = right_sum+ nums[i];
        }

        int left_sum = 0;
        for (int l=0 ; l < nums.length; l++){
            right_sum = right_sum - nums[l];
            if (right_sum == left_sum){
                index = l;
            }
            left_sum += nums[l];
        }
        System.out.println(index);

       // System.out.println(pivIndex);

    }
}
