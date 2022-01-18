package matrix;

//TC- O(R+C) & AS- O(1)
public class OptimizedSearchInRowWiseAndColumnWiseSorted {
    static void getResult(int[][] arr, int x) {
        int R = arr.length, C = arr[0].length;
        int i = 0, j = C-1;

        while(i < R && j >= 0) {
            if(arr[i][j] == x) {
                System.out.print("Found at " + "(" + i + ", " + j + ")");
                return;
            }else if(x < arr[i][j]) {
                j--;
            }else {
                i++;
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
