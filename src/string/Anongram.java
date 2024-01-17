package string;

import java.util.Arrays;

public class Anongram {

    public static void main(String[] args) {

        String s = "rat";
        String t = "car";

        if(s.length() != t.length()){
            System.out.println("false");
        }


        char ch1[] = s.toCharArray();
        char ch2[] = t.toCharArray();


        Arrays.sort(ch1);
        Arrays.sort(ch2);



        System.out.println(ch1);
        System.out.println(ch2);
/*

        for (int i=0 ; i< s.length(); i++){
            for (int j=1; i<t.length();j++)
                if (s.charAt(i) > s.charAt(j)){


                }
        }
*/


    }
}
