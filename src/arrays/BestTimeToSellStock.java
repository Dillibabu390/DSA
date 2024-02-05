package arrays;

import java.util.HashMap;
import java.util.Map;

public class BestTimeToSellStock {
    public static void main(String[] args) {
        //int prices[] = { 7,1,5,3,6,4};

        int prices[] ={7,6,4,3,1};

        int index =0;
        int min = Integer.MAX_VALUE;
        for (int i=0;i<prices.length;i++){
            if (prices[i] < min){
                min = prices[i];
                index = i;
            }
        }

        int max = Integer.MIN_VALUE;
        int max_index = 0;
        for (int i=index;i<prices.length;i++){
            if (prices[i]> max){
                max = prices[i];
                max_index = i;
            }
        }
        System.out.println(prices[max_index] - prices[index]  );





    }
}
