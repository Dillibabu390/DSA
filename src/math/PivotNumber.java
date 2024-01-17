package math;

public class PivotNumber {
    public static void main(String[] args) {

        int num = 8;

       /* for (int i =1 ; i<=3 ; i++){
            System.out.println(i);
        }
        for (int i = 3 ; i<= num;i++){
            System.out.println(i);
        }*/


        int total = num* (num+1)/2;
        System.out.println(total);

        int j =1;
        int sum =0;
        for (int i = num; i <=1; i--) {
            sum = sum +i;
           // System.out.println(total-i);
            j++;
            if (sum == j){
                System.out.println(i);
            }
        }







        /*int arry[] = { 1,2,3,4,5,6,7,8};

        int sum =0;
        for (int i=0;i< arry.length;i++) {
            sum = sum + arry[i];

        }*/


      /*  int right =0;
        int left = 0;
        while (right< args.length){

            right =right+ arry[]


            right++;
            left --;
        }*/




    }
}
