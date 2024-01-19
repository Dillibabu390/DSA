package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElement {
    public static void main(String[] args) {

        int nums[] = {1,1,2,3,3,5};
        int val = 1;
        int index = 0;

        List<Integer> integers = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {
                integers.add(nums[i]);
                nums[index] = nums[i];
                index++;

            }

        }
        System.out.println(integers);
        System.out.println(index);
    }
}
