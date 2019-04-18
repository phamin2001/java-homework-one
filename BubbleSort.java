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

// lui=4/i=0: 23, 54, 4, 78, 1
// lui=4/i=1: 23, 4, 54, 78, 1
// lui=4/i=2:
// lui=4/i=3: 23, 4, 54, 1, 78

// lui=3/i=0: 4, 23, 54, 1, 78
// lui=3/i=1:
// lui=3/i=2: 4, 23, 1, 54, 78

// lui=2/i=0:
// lui=2/i=1: 4, 1, 23, 54, 78

// lui=1/i=0: 1, 4, 23, 54, 78

