import java.util.Arrays;

public class phan1 {

    // Linear Search
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // Return the index if key is found
            }
        }
        return -1; // Key not found
    }

    // Binary Search (Array must be sorted)
    public static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                return mid; // Key found
            }
            if (arr[mid] < key) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }
        return -1; // Key not found
    }

    // Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Method to find the maximum element in an array
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Method to calculate the sum of array elements
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // Example of using loops and conditions
    public static void demonstrateLoopsAndConditions() {
        // For loop example
        for (int i = 0; i < 5; i++) {
            System.out.println("For loop iteration: " + i);
        }

        // While loop example
        int j = 0;
        while (j < 5) {
            System.out.println("While loop iteration: " + j);
            j++;
        }

        // If-else example
        int number = 10;
        if (number > 0) {
            System.out.println("Number is positive");
        } else if (number < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }

        // Switch-case example
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Other day");
                break;
        }
    }

    public static void main(String[] args) {
        // Sample array for testing
        int[] arr = {64, 25, 12, 22, 11};
        int key = 22;

        // Test Linear Search
        int linearResult = linearSearch(arr, key);
        System.out.println("Linear Search: Key found at index: " + linearResult);

        // Test Bubble Sort
        bubbleSort(arr);
        System.out.println("Sorted array using Bubble Sort: " + Arrays.toString(arr));

        // Test Binary Search (after sorting)
        int binaryResult = binarySearch(arr, key);
        System.out.println("Binary Search: Key found at index: " + binaryResult);

        // Test finding maximum and sum
        System.out.println("Maximum element: " + findMax(arr));
        System.out.println("Sum of elements: " + calculateSum(arr));

        // Demonstrate loops and conditions
        demonstrateLoopsAndConditions();
    }
}
