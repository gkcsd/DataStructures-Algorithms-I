package sorting;

import java.util.Scanner;

//TC- O(n(log(n))) & AS- O(1)
public class HeapSort {
    static void maxHeapify(int[] arr, int n, int i) {
        int largest = i, left = 2*i+1, right = 2*i+2;

        if(left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        if(right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if(largest != i) {
            //Swapping
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;

            maxHeapify(arr, n, largest);
        }
    }

    static void buildHeap(int[] arr, int n) {
        for(int i = (n-2)/2; i >= 0; i--) {
            maxHeapify(arr, n, i);
        }
    }

    static void heapSort(int[] arr) {
        int n = arr.length;

        buildHeap(arr, n);

        for(int i = n-1; i >= 1; i--) {
            //Swapping
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            maxHeapify(arr, i, 0);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        heapSort(arr);

        for(int x: arr) {
            System.out.print(x + " ");
        }
    }
}
