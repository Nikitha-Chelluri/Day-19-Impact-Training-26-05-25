import java.util.*;
class InsertionSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        for (int j = 1; j < n; j++) {
            int key = arr[j];
            int k = j - 1;
            while (k >= 0 && arr[k] > key){
                arr[k+1] = arr[k];
                k--;
            }
            arr[k+1] = key;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

// O(n)
// Worst Case = O(n^2)