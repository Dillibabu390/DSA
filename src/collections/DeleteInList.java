package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeleteInList {
    public static void main(String[] args) {

        //https://leetcode.com/problems/remove-element/solutions/3670940/best-100-c-java-python-beginner-friendly/
        List<Integer> nums = new ArrayList<>(Arrays.asList(1,1,2));
       // System.out.println(nums);
        List<Integer> ans = new ArrayList<>();


        ans.add(1);
        for (int i=1; i< nums.size(); i++){
            if (nums.get(i-1) != nums.get(i)){
                ans.add(nums.get(i));
            }
        }

        System.out.println(ans);


    }
}
