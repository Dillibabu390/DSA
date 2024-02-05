package arrays;


public class ThirdMaximunNumber {
    public static void main(String[] args) {
        int nums[] = { 44,67,32,54,66,2,1,8,1};

        int max = Integer.MIN_VALUE;
        for (int i=0;i<nums.length;i++){
            if (nums[i]>max){
                max = nums[i];
            }
        }


        int sec_max = Integer.MIN_VALUE;
        for (int i=0;i<nums.length;i++){
            if (max != nums[i]) {
                if (nums[i] > sec_max) {
                    sec_max = nums[i];
                }
            }
        }


    }
}
