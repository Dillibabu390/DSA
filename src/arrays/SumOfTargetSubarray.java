package arrays;

public class SumOfTargetSubarray {
    public static void main(String[] args) {

        int nums [] ={1,2,3};

        int k = 0;

        for (int i =0 ; i< nums.length ;i++)
        {
            int sum  = 0;

            for (int j = i ; j< nums.length; j++){
                sum = sum + nums[j];

                if (sum == 3){
                    k++;
               //     System.out.println(":"+ nums[j]);
                }
            }
        }

        System.out.println(k);



    }
}
