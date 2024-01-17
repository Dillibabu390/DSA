package arrays;

public class Max {
    public static void main(String[] args) {

        int arr[]= { 6,4,3,7,10,5,55};

        int max = arr[0];
        for (int i =0 ; i< arr.length; i++){
            if (max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);

        // min
        // max > arr[i]


    }
}
