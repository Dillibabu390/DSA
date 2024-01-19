package arrays;

public class Insert {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int element = 10;
        int index = 2;

        // Shift elements to the right
        for (int i = array.length - 1; i > index; i--) {

            array[i] = array[i - 1];
            System.out.println(i);

        }

        // Insert the new element
        array[index] = element;

        // Print the updated array
        for (int num : array) {
            System.out.print(num);
        }



    }
}
