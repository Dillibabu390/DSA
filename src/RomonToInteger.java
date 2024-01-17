public class RomonToInteger {
    public static void main(String[] args) {

        String value = "MCMXCIV";



/*
        I can be placed before V (5) and X (10) to make 4 and 9.
        X can be placed before L (50) and C (100) to make 40 and 90.
        C can be placed before D (500) and M (1000) to make 400 and 900.
*/

     /*
        IV  IX
        XL  XC
        CD  CM

      */


        int sum = 0;


        for (int i = 0; i < value.length(); i++) {
            switch (value.charAt(i)) {

                case 'I':
                    sum = sum + 1;
                    break;

                case 'V':
                    sum = sum + 5;
                    break;

                case 'X':
                    sum = sum + 10;
                    break;

                case 'L':
                    sum = sum + 50;
                    break;

                case 'C':
                    sum = sum + 100;
                    break;

                case 'D':
                    sum = sum + 500;
                    break;

                case 'M':
                    sum = sum + 1000;
                    break;
            }
        }

        System.out.println(sum);

      }
    }
