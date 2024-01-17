package arrays;

public class Target {
    public static void main(String[] args) {

        int arr [] = {4,6,8,2,3,5};
        int target =7;

        int nums[] = new int[2];

        for (int i=0 ; i< arr.length; i++){
            for (int j=1 ; j < arr.length ; j++){
             if (arr[i] + arr[j] == target){
                 nums[0] = arr[i];
                 nums[1] = arr[j];
             }

            }
           // System.out.println(arr[i]);
        }

    }
}
