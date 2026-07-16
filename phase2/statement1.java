package phase2;

import java.util.Arrays;
import java.util.Scanner;

public class statement1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array:\t");
        int size = sc.nextInt();

        System.out.print("Enter the Target variable:\t");
        int target = sc.nextInt();

        int[] myArr = new int[size];

        // initializing array element
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = i + 1;
        }

        // Print array (optional)
        System.out.println(Arrays.toString(myArr));

        // Loop 2
        // Search using i
        for (int i = 0; i < myArr.length; i++) {
            // finding traget value by adding 2 elements
            for (int j = i + 1; j < myArr.length; j++) {
                int result = myArr[i] + myArr[j];

                if (result == target) {
                    System.out.println("Positions = ( " + i + " , " + j + " )");
                    return;
                }
            }
        }

        sc.close();
    }
}
