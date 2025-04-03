import java.util.Arrays;

public class TwoDimensionalArrays {
    int[][] arr = null;

    public static void main(String[] args) {
        TwoDimensionalArrays obj = new TwoDimensionalArrays(3, 3);
        // print the array elements 
        System.out.println(Arrays.deepToString(obj.arr));

        obj.insertValuesiNTwoDimensionalArrays(0, 0, 1);
        obj.insertValuesiNTwoDimensionalArrays(0, 2, 2);
        obj.insertValuesiNTwoDimensionalArrays(1, 1, 3);
        obj.insertValuesiNTwoDimensionalArrays(1, 2, 4);

        // retrieval 
        System.out.println(obj.retrieveValueFromTwoDimensionalArray(1, 1));

        // search 
        obj.searchValueinTwodimenntionalArray(4);
        obj.deleteElementFromTwoDimensionalArray(4);
        System.out.println("Array  after deletions " + Arrays.deepToString(obj.arr));

    }

    public TwoDimensionalArrays(int rows, int columns) {
        this.arr = new int[rows][columns];

        for (int row = 0; row < arr.length; row++) {

            // for loop for column
            for (int col = 0; col < (arr[0].length); col++) {
                // assign the vaues
                arr[row][col] = Integer.MIN_VALUE;
            }
        }

    }

    // insert values 

    public void insertValuesiNTwoDimensionalArrays(int row, int col , int val ) {

        try{
            if ( arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col]  = val;
            }else{
                System.out.println("Value already occupied ");
            }
        }catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Arrays index bound  error ");
        }
       


    }


    public int retrieveValueFromTwoDimensionalArray(int row, int col ) {


        if( arr.length== 0)  {
            System.out.println("Array is Empty");
        }

        int valueRetrieved = arr[row][col] ;
        return valueRetrieved;
    }
  

    // search value in Array

    public void searchValueinTwodimenntionalArray(int value) {
        if(arr.length <=0) {
            System.out.println("Array is Empty");
        }

        for( int row=0; row<= arr.length-1 ; row++) {
            for(int col =0; col<= (arr[0].length-1); col++) {
                if( arr[row][col] == value) {
                    System.out.println("Hi am here");
                    System.out.println(String.format("%d found at the index %d %d",value, row, col ));
                }
            }
        }
    }


    public void deleteElementFromTwoDimensionalArray (int value ) {
        if(arr.length ==0 ) {
            System.out.println("Array is Empty");
        }

        for( int row= 0; row< arr.length ; row++) {
            for ( int col =0; col< (arr[0].length ); col++) {
                if(arr[row][col] == value) {
                    arr[row][col] = Integer.MIN_VALUE;
                }
            }
        }
    }

}