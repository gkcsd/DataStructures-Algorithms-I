package matrix;

//TC- O(R*C) & AS- O(1)
public class NaiveSearchInRowWiseAndColumnWiseSortedMatrix {
    static void getResult(int[][] arr, int x) {
        int R = arr.length;
        int C = arr[0].length;

        for(int i = 0; i < R; i++) {
            for(int j = 0; j < C; j++) {
                if(arr[i][j] == x) {
                    System.out.println("Found at " + "(" + i + ", " + j + ")");
                    return;
                }
            }
        }
        System.out.println("Not Found");
    }
    public static void main(String[] args) {
        int[][] arr = {{10,20,30,40}, {15,25,35,45}, {27,29,37,48}, {32,33,39,50}};
        int x = 29;
        getResult(arr, x);
    }
}
