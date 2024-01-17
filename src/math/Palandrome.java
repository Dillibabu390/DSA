package math;

public class Palandrome {
    public static void main(String[] args) {
        int x = 121;
        int temp = x;

        int sum = 0;

        if (x < 0) {
            System.out.println("not an palandrome");
        }else {
            while (temp > 0) {
                int num = temp % 10;
                temp = temp / 10;
                sum = sum * 10 + num;
            }
            if(x == sum){
                System.out.println("palandrome");
            }else {
                System.out.println("not an palandrome");
            }
        }
    }
    }

