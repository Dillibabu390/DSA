package algorithms.array;

public class KadaeAlgorithm {
    public static void main(String[] args) {

        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};

        int bag= 0;
        int ans = Integer.MIN_VALUE;
        for (int i=0 ;i< nums.length; i++){
            bag = bag + nums[i];
            if (bag > ans){
                ans = bag;
            }
            if (bag < 0){
                bag = 0;
            }
        }

        System.out.println(ans);


    }
}
