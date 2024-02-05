package algorithms.array;

public class BoreVoting {
    public static void main(String[] args) {

        int nums[] ={3,2,3};

        int temp = nums[0];
        int count = 1;
        for(int i=1; i<=nums.length-1; i++){
            if(temp == nums[i]){
                count++;
            }
            else{
                count--;
            }
            if(count == 0){
                temp = nums[i];
                count++;
            }
        }
        System.out.println(temp);
        }
    }

