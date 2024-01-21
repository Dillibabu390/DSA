package arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {

        int nums[] = {1,2,3};

        Set<Integer> dup = new HashSet<>();
        boolean result = false;
        for (int i=0;i<nums.length;i++){
           if (dup.contains(nums[i])){
               result = true;
           }
           else {
               dup.add(nums[i]);
           }
        }

        System.out.println(result);

    }
}
