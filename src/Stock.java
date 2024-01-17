public class Stock {
    public static void main(String[] args) {

        int arry[] = {7, 1, 5, 3, 6, 4};


        int min = Integer.MAX_VALUE;
        int max_profit = 0;

        for (int i = 0 ; i< arry.length ; i++){
            if (arry[i] < min){
                min = arry[i];
            }
            else if (arry[i] - min > max_profit){
                max_profit = arry[i] -min;
            }
        }

        System.out.println(max_profit);
    }
}
