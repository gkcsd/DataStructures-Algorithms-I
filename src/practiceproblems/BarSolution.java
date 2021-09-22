package practiceproblems;

import java.util.Scanner;

public class BarSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        double wine = sc.nextDouble();

        double res = getSolution(i, j, wine);
        System.out.println(res);
    }

    static double getSolution(int row, int col, double w) {
        int sum = 0;
        if(row > col)
            System.out.println("No glass exits");

        for (int i = 0; i < row; i++) {
            for(int j = 1;  j <= i || j <= col; j++) {
                sum++;
            }
        }
        return ((double)w/sum);
    }
}
