package arrays;

import java.util.Scanner;

public class NaiveSolutionStockBuyAndSellSolution {
    static int getMaxProfit(int[] price, int start, int end) {
        if(end <= start)
            return 0;
        int profit = 0;

        for(int i = start; i < end; i++) {
            for(int j = i+1; j <= end; j++) {
                if(price[j] > price[i]) {
                    int currentProfit = price[j] - price[i]
                            + getMaxProfit(price, start, i-1)
                            + getMaxProfit(price, j+1, end);
                    profit = Math.max(profit, currentProfit);
                }
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = getMaxProfit(arr,0, arr.length - 1);
        System.out.println(res);
    }
}
