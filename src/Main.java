import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] array2 = new int[2][2]; // [][] denotes 2-dimensional array. First brackets set the number of nested
        //arrays in the 'array2' 2-dimensional array. the second brackets set the number of elements per nested array.
        //the number of elements in nested arrays can be left blank which will set default value to null, but the
        //first set of brackets defining the number of nested arrays must be specified
        System.out.println(Arrays.toString(array2)); //prints memory addresses of nested arrays
        System.out.println("array2.length = " + array2.length); // has length of 2 for the 2 nested arrays

        array2 [0][0] = 1; //first nested array at first index = 1
        array2 [0][1] = 2; // first nested array at second index = 2
        array2[1][0] = -1; // second nested array at first index = -1
        array2 [1][1] = -2;

        for (int[] outer : array2) { //loops through and prints each nested array
            System.out.println(Arrays.toString(outer));
        }

        System.out.println("");

        for (int i = 0; i < array2.length; i++) { //nested for loop for elements of each nested array
            var innerArray = array2[i];
            for (int j = 0; j < innerArray.length; j++) {
                System.out.print(array2[i][j] * 2 + " ");
                // prints the elements again of for each index of nested array and demonstrates math capacity where
                //elements not changed in value, but values used in computation
            }
            System.out.println();
        }

        System.out.println("");

        for (var outer : array2) { // nested enhanced for loop version. 'var' keyword used so java can internally
            // determine the correct type as int array
            for (var element : outer) { // again var used and java determines int primitive type used
                System.out.print(element * 3 + " ");
            }
            System.out.println();
        }

        System.out.println("");
        System.out.println("'.deepToString' method prints 2-dimensional array on single line --> " + Arrays.deepToString(array2));
    }
}