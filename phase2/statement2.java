package phase2;

import java.util.Arrays;

public class statement2 {
    public static void main(String[] args) {
        // int[] myArr = {1,1,2,2,3,3,4,5,5};
        // int[] myArr = {1};
        // int[] myArr = {1,1};
        // int[] myArr = {1,2};
        // int[] myArr = {1,2,2};
        // int[] myArr = {1,1,1,1};
        int[] myArr = {1,2,3,4};

        // Create reader and writer.
        int read = 0, write = 0;

        // Check if the current value is different.

        // If yes, overwrite and move the writer.

        // Print the array after each iteration if you get confused.

        
        // int arrSize = myArr.length -1;

        for (int i = 0; i < myArr.length; i++) {
            // Make the reader walk through the array.
            read = i;
            
            if ( myArr[write] == myArr[read]) {
                read++;
                
            }else{
                write++;
                myArr[write] = myArr[read];
            }
            
        }
        System.out.println();

        System.out.println(Arrays.toString(myArr));
    }
}
