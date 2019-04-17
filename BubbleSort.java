public class BubbleSort {
    public static void main(String[] args) {
        int[] arrayOfNums = {54, 23, 4, 78, 18};
        System.out.println("===================");
        System.out.println("Before Sort:");
        printArrayOfNums(arrayOfNums);

        for (int i = 0; i < arrayOfNums.length ; i++) {
            for(int j = i + 1; j < arrayOfNums.length; j++) {
                if(arrayOfNums[i] > arrayOfNums[j]) {
                    swapNums(i, j, arrayOfNums);
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

    public static void swapNums(int index1, int index2, int[] arr) {
        int swap;
        swap = arr[index2];
        arr[index2] = arr[index1];
        arr[index1] = swap;
    }

    public static void printArrayOfNums(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}