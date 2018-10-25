package ua.zp.brainacad.lab4;

import java.util.Arrays;

public class Lab4Test {

    public static void main(String[] args) {

        // PART 1
        // 1.1)
        float[] firstArray = new float[4];// TODO init it's array by new with size 4.


        // TODO insert some value to start of array and to end of array.

        int[] intArray = {9, 15, 8, 21};// TODO init and fill it's array with any values. Use {} syntax.
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }

        // 1.2)
        int[] intArrayCopy = {15, 2, 7, 12};// TODO copy "intArray". Use copyOf...
        int[] intArray1 = Arrays.copyOf(intArrayCopy, intArrayCopy.length);
        for (int i = 0; i < intArrayCopy.length; i++) {
            System.out.println(intArray1[i]);
        }


        // 1.3)
        // TODO sort "intArrayCopy", use Arrays sort.
        int[] arr2 = {6, 8, 12, 21};
        for (int i = 0; i < arr2.length; i++) {
            Arrays.sort(arr2);
            System.out.print(arr2[i] + " ");
        }

        // 1.4)
        // TODO print "intArrayCopy", use Arrays toString.
        int[] arr3 = {12, 6, 15, 21};
        for (int i = 0; i < 1; i++) {
            System.out.println(Arrays.toString(arr3));

        }

        // 1.5)
        // TODO compare "intArray"  and "intArrayCopy", use Arrays equals. Print "Arrays equals" or "Arrays not equals".


        // PART 2
        int[] testArray = {1, 3, 5, 7, 8, 6, 4, 2, 0};

        // Print array values in cycle.
        for (int value : testArray) {
            System.out.print(value + " ");
        }

        // 2.1)
        // TODO calc sum of all array elements and print result.

        // 2.2)
        // TODO calc sum of all numbers with odd indexes and print result.

        // 2.3)
        // TODO find max value in array.


        // PART 3

        //3.1
        // TODO create two-dimensional array with size [3][4]

        //3.2
        // TODO fill array with any numbers in cycles.

        //3.3
        // TODO calc sum of all array elements and print result.


        // PART 4*

        long[][] matrix = new long[9][9];

        int ratio = 0;
        for (long[] row : matrix) {
            Arrays.fill(row, ++ratio);
        }

        int sum = 0;
        // TODO* calc sum only max and min values of matrix by expression: 2 < i <= 5 and only every third j value.
        System.out.println(sum);
    }
}
© 2018GitHub,Inc.