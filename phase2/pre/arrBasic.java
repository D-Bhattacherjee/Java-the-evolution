package phase2.pre;

import java.util.Arrays;

public class arrBasic {
    public static void main(String[] args) {
        System.out.println("\n    |\tArray tutorial\t|    \n");

        // To declare an array, define the variable type with square brackets [ ]
        // type[] var_name
        String[] myCars = {"BMW M3 Evolution", "Toyota Supra", "Mazda F12"};

        // print it through the for loop
        for (int i = 0; i < myCars.length; i++) {
            System.out.println(myCars[i]);
        }

        // You can also create an array by specifying its size with new.
        // This makes an empty array with space for a fixed number of elements, which you can fill later

        // type[] name_array = new type[size_array]
        int[] myArr = new int[5];

        // let's loop in the elements
        for (int j = 0; j < myArr.length; j++) {
            myArr[j] = j * ((j+1)*5);
        }

        // another way print an array without looping
        System.out.println(Arrays.toString(myArr));
    }
}
