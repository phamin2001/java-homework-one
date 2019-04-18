public class InsertionSort {


    public static void main(String[] args) {

        int[] arrayOfNums = { 20, 35, -15, 7, 55, 1, -22};

        System.out.println("===================");
        System.out.println("Before Sort:");
        printArrayOfNums(arrayOfNums);

        // sorted partion grows from left to right
        for(int firstUnsortedIndex = 1; firstUnsortedIndex < arrayOfNums.length; firstUnsortedIndex++) {

            int newElement = arrayOfNums[firstUnsortedIndex];
            int i;

            for (i = firstUnsortedIndex; i > 0 && arrayOfNums[i - 1] > newElement ; i--) {
                arrayOfNums[i] = arrayOfNums[i - 1];
            }

            arrayOfNums[i] = newElement;
        }

        System.out.println();
        System.out.println("===================");
        System.out.println("After Insertion Sort: ");
        printArrayOfNums(arrayOfNums);
        System.out.println();
        System.out.println("====================");
    }

    public static void printArrayOfNums(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}