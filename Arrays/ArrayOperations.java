import java.util.Arrays;

public class ArrayOperations {

    int[] singleDimensionalArray = null;

    public ArrayOperations(int arraySize) {

        singleDimensionalArray = new int[arraySize];
        for (int i = 0; i < singleDimensionalArray.length; i++) {
            singleDimensionalArray[i] = Integer.MIN_VALUE;
        }
    }

    public void insertValuesInArray(int index, int value) {

        try {
            if (singleDimensionalArray[index] == Integer.MIN_VALUE) {
                singleDimensionalArray[index] = value;
                System.out.println(" Value is inserted ");
            } else {
                System.out.println(" Index is already occupied ");
            }
        } catch (ArrayIndexOutOfBoundsException arrException) {
            System.out.println("Array index out of bound exception ");
        }

    }

    public void traverseArray(int[] arr) {
        /// check the length

        if (arr.length <= 0) {
            System.out.println("Array is Empty");
        } else {
            for (int i = 0; i < arr.length - 1; i++) {
                System.out.print(arr[i] + "  ");
            }
        }
        System.out.println("  ");
    }

    public int searchElementInArray(int[] arr, int valueToSearch) {

        if (arr.length <= 0) {
            System.out.println("Array is empty");
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == valueToSearch) {
                System.out.println(
                        String.format("value : %s is present in the index : %s of an array !!", valueToSearch, i));
                return i;
            }
        }
        return 0;

    }

    public void deleteElementInArray(int[] arr, int valueToBeDeleted, int index) {
        if (arr.length > 0) {
            // if index is known
            if (index  !=0 ) {
                arr[index] = Integer.MIN_VALUE;
            } else {
                for (int i = 0; i < arr.length - 1; i++) {
                    if (arr[i] == valueToBeDeleted) {
                        arr[i] = Integer.MIN_VALUE;
                    }
                }
            }

        } else {
            System.out.println("Array is empty");
        }
    }

    public void printArrayElements(int[] arr) {
        System.out.println("Array elements ");
        for (Integer val : singleDimensionalArray) {
            System.out.print(val + "  ");
        }
    }

    public static void main(String[] args) {
        ArrayOperations arrayOperations = new ArrayOperations(5);
        arrayOperations.insertValuesInArray(0, 1);
        arrayOperations.insertValuesInArray(1, 2);
        arrayOperations.insertValuesInArray(2, 3);
        arrayOperations.insertValuesInArray(3, 4);
        System.out.println(Arrays.toString(arrayOperations.singleDimensionalArray));

        // traversal

        // --> timeComplexity -> O(N)
        // SpaceComplexity --> O(N)
        arrayOperations.traverseArray(arrayOperations.singleDimensionalArray);

        // searching in array
        // --> timeComplexity -> O(N) and SpaceComplexity --> O(N)
        System.out.println(arrayOperations.searchElementInArray(arrayOperations.singleDimensionalArray, 4));

        arrayOperations.deleteElementInArray(arrayOperations.singleDimensionalArray, 4, 3);

        // two dimensional Arrays 

        System.out.println("To dimensional Arrays");
        arrayOperations.twoDimensionalArraysOperations();

    }

    public void twoDimensionalArraysOperations() {

        // initialization
        int[][] arr = new int[3][3];

        arr = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(Arrays.deepToString(arr));

    }
}