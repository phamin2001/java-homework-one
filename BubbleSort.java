public class BubbleSort {

    public static void main(String[] args) {
        int[] arrayOfNums = {54, 23, 4, 78, 1};
        System.out.println("===================");
        System.out.println("Before Sort:");
        printArrayOfNums(arrayOfNums);

        // sorted partition grows right to left
        for (int lastUnsortedIndex = arrayOfNums.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for(int i = 0; i < lastUnsortedIndex; i++) {
                if(arrayOfNums[i] > arrayOfNums[i+1]) {
                    swap(i, i+1, arrayOfNums);
                }
            }
        }

        System.out.println();
        System.out.println("===================");
        System.out.println("After Sort: ");
        printArrayOfNums(arrayOfNums);
        System.out.println();
        System.out.println("====================");
    }

    public static void swap(int index1, int index2, int[] arr) {
        int temp;
        temp        = arr[index2];
        arr[index2] = arr[index1];
        arr[index1] = temp;
    }

    public static void printArrayOfNums(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}