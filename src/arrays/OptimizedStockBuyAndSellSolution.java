package arrays;

import java.util.Scanner;

//TC- O(n) & As- O(1)
public class OptimizedStockBuyAndSellSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i =0; i<n; i++) {
            arr[i]=sc.nextInt();
        }
        int res = getMaxBuy(arr);
        System.out.println(res);
    }
    static int getMaxBuy(int[] price) {
        int n = price.length;
        int profit = 0;
        for(int i = 1; i < n; i++) {
            if(price[i] > price[i-1])
                profit+=price[i]-price[i-1];
        }
        return profit;
    }
}
