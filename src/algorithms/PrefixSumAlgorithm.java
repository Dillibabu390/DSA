package algorithms;

import java.util.Arrays;

public class PrefixSumAlgorithm {
    public static void main(String[] args) {

        int nums[] ={1,2,3};

       // int j=0;

        for (int i =1; i< nums.length;i++){
            nums[i] = nums[i] + nums[i-1];
        }

        System.out.println(Arrays.toString(nums));

    }
}
