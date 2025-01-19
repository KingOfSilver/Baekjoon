package ArraySort.HeapSort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        heapSort(arr);
        for (int num : arr) System.out.println(num);
     }

    public static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void makeHeap (int[] arr, int length, int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        int largest = i;

        if (left < length && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < length && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(i, largest , arr);
            makeHeap(arr, length, largest);
        }
    }

    public static void makeMaxHeap (int[] arr) {
        int length = arr.length;
        for (int i = arr.length /2; i >= 0; i--) makeHeap(arr, length , i);
    }

    public static void heapSort(int[] arr) {
        int length = arr.length;
        makeMaxHeap(arr);
        for (int i = arr.length - 1; i > 0; i-- ) {
            swap(i , 0 , arr);
            length--;
            makeHeap(arr, length, 0);
        }
    }
}
