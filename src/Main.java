import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int arr[] = {1, 2, 3, 4, 5};
        int targetSum = 4;
        int[] array = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i]+ arr[j] == targetSum) {
                 array[0] = arr[i];
                 array[1] = arr[j];
                }
            }
        }
        System.out.println(Arrays.toString(array) );
    }

      //  System.out.println(Arrays.toString(array));
      //  System.out.println("Hello world!");
    }
