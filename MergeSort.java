import java.util.*;

public class MergeSort {

    public static void main(String[] args) {

        int[] arrayOfNums = { 20, 35, -15, 7, 55, 1, -22};

        System.out.println("===================");
        System.out.println("Before Sort:");
        printArrayOfNums(arrayOfNums);


        int startIndex = 0;
        int endIndex   = arrayOfNums.length;
        mergeSort(arrayOfNums, startIndex, endIndex);

        System.out.println();
        System.out.println("===================");
        System.out.println("After Merge Sort: ");
        printArrayOfNums(arrayOfNums);
        System.out.println();
        System.out.println("====================");



    }

    public static void printArrayOfNums(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void mergeSort(int[] input, int start, int end) {
        // base case
        if (end - start < 2) {
            return;
        }

        int midpoint = (start + end) / 2;

        mergeSort(input, start   , midpoint);
        mergeSort(input, midpoint, end);

        merge(input, start, midpoint, end);
    }

    public static void merge(int[] input, int start, int mid, int end) {
        // base case
        if (input[mid - 1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] tempArray = new int[end - start];

        while (i < mid && j < end) {
            tempArray[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        // taking care of leftover elements in left or right partitoons
        // if leftover elements in left partion we have to copy it in tempArray
        // but if we have elements in right partion we don't have to do anything

        // copy a leftover in left partion in input instead of tempArray for optimization
        // if we traverse all left partion mid - i become 0 and this line is never happening
        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        // now take care of leftover in right partion
        System.arraycopy(tempArray, 0, input, start, tempIndex);
    }
}