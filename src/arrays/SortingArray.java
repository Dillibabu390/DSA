package arrays;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {

        int nums[] = { 3,5,3,6,2,9};

        int a_pointer = 0;
        int b_pointer = 1;
        int len = nums.length -1 ;

        while (a_pointer < len){
            if (nums[a_pointer] > nums[b_pointer]) {
                int num = nums[a_pointer];
                nums[a_pointer] = nums[b_pointer];
                nums[b_pointer] = num;
            }
            a_pointer ++;
            b_pointer ++ ;
        }

        System.out.println(Arrays.toString(nums));


    }
}
