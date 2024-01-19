package arrays;

import java.util.Arrays;

public class Append {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        int newElement = 6;

      //  int[] newArray = new int[arr.length + 1];

       // System.arraycopy(arr, 0, newArray, 0, arr.length);

       int[] newArray = Arrays.copyOf(arr,arr.length+1);

        newArray[newArray.length - 1] = newElement;

        System.out.println(Arrays.toString(newArray));

    }
}
