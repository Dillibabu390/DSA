package arrays;

import java.util.HashSet;
import java.util.Set;

public class SingleElement {
    public static void main(String[] args) {
        int arry[] = { 3,1,3,4,2,2,1};

        Set<Integer> dup = new HashSet<>();
        int num = 0;
        for (int i =0;i<arry.length;i++){
            if (dup.contains(arry[i])){
                num = arry[i];
            }else {
                dup.add(arry[i]);
            }

        }

        System.out.println(num);
    }
}
