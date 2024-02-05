package arrays;
import java.util.Arrays;


public class MajorityElementArray {
    public static void main(String[] args) {
        int arry[] = {1,2,3,3,3,4,5,4,4,4,5,5,5,6,5};



        Arrays.sort(arry);
        System.out.println(Arrays.toString(arry));
       int n = arry.length;
        System.out.println(arry[n/2]);
    }
}
