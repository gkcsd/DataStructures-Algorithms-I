package matrix;

//TC- Θ{R*C) & AS- O(1)
public class SpiralTraversalOfMatrix {
    static void printSpiral(int[][] arr) {
        int R = arr.length;
        int C = arr[0].length;

        int Top = 0, Right = R-1, Bottom = C-1, Left = 0;

        while(Top <= Bottom && Left <= Right) {

            for(int i = Left; i <= Right; i++) {
                System.out.print(arr[Top][i] + " ");
            }
            Top++;

            for(int i = Top; i <= Bottom; i++) {
                System.out.print(arr[i][Right] + " ");
            }
            Right--;

            if(Top <= Bottom) {
                for(int i = Right; i >= Left; i--) {
                    System.out.print(arr[Bottom][i] + " ");
                }
                Bottom--;
            }

            if(Left <= Right) {
                for(int i = Bottom; i >= Top; i--) {
                    System.out.print(arr[i][Left] + " ");
                }
                Left++;
            }

        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};

        printSpiral(arr);
    }
}
