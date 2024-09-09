public class MergeSort {
    
    // Public method to sort an array
    public static void mergeSort(int[] array) {
        if (array.length < 2) {
            return; // Base case: arrays with less than 2 elements are already sorted
        }
        
        // Divide the array into two halves
        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];
        
        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        
        for (int i = mid; i < array.length; i++) {
            right[i - mid] = array[i];
        }
        
        // Recursively sort each half
        mergeSort(left);
        mergeSort(right);
        
        // Merge the sorted halves
        merge(array, left, right);
    }
    
    // Method to merge two sorted arrays
    private static void merge(int[] array, int[] left, int[] right) {
        int leftSize = left.length;
        int rightSize = right.length;
        int i = 0, j = 0, k = 0;
        
        // Merge the two arrays into the original array
        while (i < leftSize && j < rightSize) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }
        
        // Copy the remaining elements from left array, if any
        while (i < leftSize) {
            array[k++] = left[i++];
        }
        
        // Copy the remaining elements from right array, if any
        while (j < rightSize) {
            array[k++] = right[j++];
        }
    }
    
    // Main method for testing the merge sort
    public static void main(String[] args) {
        int[] array = { 38, 27, 43, 3, 9, 82, 10 };
        
        System.out.println("Original array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        
        mergeSort(array);
        
        System.out.println("\nSorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
