package bitmagic;

import java.util.Scanner;

//TC- O(n) & AS- O(1)
public class VariationSolutionOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
        }
        int res=varSol(arr,n);
        System.out.println(res);
    }
    static int varSol(int arr[], int n) {
        int i1=arr[0];
        int i2=1;
        for(int i=1; i<n; i++) {
            i1=i1^arr[i];
        }
        for(int i=2; i<=n+1; i++){
            i2=i2^i;
        }
        return (i1^i2);
    }
}
