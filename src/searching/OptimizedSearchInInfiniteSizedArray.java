package searching;

//TC- O(log(pos)) & AS- O(log(pos))
public class OptimizedSearchInInfiniteSizedArray {
    static int getSearchElem(int[] arr, int x) {
        if(arr[0] == x) return 0;
        int i = 1;
        while(arr[i] < x) {
            i = i*2;
        }

        if(arr[i] == x) return i;

        return binarySearch(arr,((i/2)+1), i-1, x);
    }
    static int binarySearch(int[] arr, int low, int high, int x) {
        while(low <= high) {
            int mid = (high+low)/2;

            if(arr[mid] == x) return mid;

            if(arr[mid] > x) {
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 40, 60, 80, 100, 200, 500, 100};
        int x = 100;

        int res = getSearchElem(arr, x);
        System.out.println(res);
    }
}
