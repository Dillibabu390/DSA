package arrays;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {

        int a[] ={3,2,3};

        int n = a.length;
        Arrays.sort(a);

        System.out.println(n);

        System.out.println(a[n/2]);
        }
    }

