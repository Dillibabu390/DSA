package arrays;

import java.util.Arrays;


public class Delete {
    public static void main(String[] args) {
        int array[] ={ 1,3,5,6,2};
        int index = 2;

        for (int i=index;i< array.length -1; i++){
            System.out.println(i);
            array[i] = array[i+1];
        }

      int newArray[] = Arrays.copyOf(array,array.length -1);
        System.out.println(Arrays.toString(newArray));


    }
}
