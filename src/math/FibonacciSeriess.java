package math;

public class FibonacciSeriess {

    public static void main(String[] args) {

      int a=-1, b =1, c=0, n =4;
        for (int i = 0; i <n; i++) {

            a = b;
            b =c ;
            c =a +b;


        }

        System.out.println(c);


    }
}
