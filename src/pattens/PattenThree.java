package pattens;

public class PattenThree {
    public static void main(String[] args) {

        int Gap = 4;

        for (int i = 1; i <=5; i++) {

            for (int j = 1; j <=Gap ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            Gap = Gap -1;
            System.out.println();

        }

    }
}
