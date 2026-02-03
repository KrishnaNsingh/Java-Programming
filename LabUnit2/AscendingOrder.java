package LabUnit2;

import java.util.Scanner;
import java.util.Arrays;

public class AscendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Get array size from user
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // 2. Input array elements
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 3. Bubble Sort Logic
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // If the current element is greater than the next, swap them
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // 4. Output the sorted array
        System.out.println("Numbers in Ascending Order:");
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
