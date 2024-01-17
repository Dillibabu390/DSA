package arrays;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {

         int [] nums = {0,1,0,3,12};

         for (int i=0;i< nums.length;i++){
             for (int j=i+1;j< nums.length;j++){

                 if(nums[i] == 0){
                     int temp = nums[i];
                     nums[i] = nums[j];
                     nums[j] = temp;
                 }

             }
         }



        System.out.println(Arrays.toString(nums));





/*
        int apointer = 0;
        int bpointer = nums.length-1;

        while( apointer <= bpointer){

            if( nums[apointer] != 0 ){

                int num = nums[apointer];
                nums[apointer] = nums[bpointer];
                nums[bpointer] = num;

            }

            apointer++;
            bpointer--;

        }
*/




    }
}
