package arrays;
public class RemoveDuplicates {
    public static void main(String[] args) {
        // remove duplicates in array

        int arr[] ={ 1,1,2,2,3,3,3,4};

        int temp =1;
        for (int i=1;i< arr.length; i++){

            if (arr[i-1] != arr[i]){
                arr[temp] = arr[i];
                temp++;
            }

        }
        System.out.println(temp);

    }
}
