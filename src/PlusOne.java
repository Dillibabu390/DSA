public class PlusOne {
    public static void main(String[] args) {


        //String sum ="";
        int sum = 0;
        int digits[] = {1,2,3};

       // System.out.println(digits.length +1);

        for(int i = 0; i< digits.length; i++){
            sum = sum + digits[i];
        }

        int fact = 1;
        for (int i=1;i< sum; i++){
            fact = fact * i;
            System.out.println(fact);
        }

    /*

          int val = (sum.charAt(sum.length()-1));
          System.out.println(val);

    */
    //    System.out.println(sum);
    }
}
