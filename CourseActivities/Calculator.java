package CourseActivities;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String again = "y";
        boolean repeat = true;

        // TODO: Run the loop while 'again' equals 'y'

        while (repeat == true) {
            double result;
            System.out.print("Enter digit 1 :\t");
            double num1 = sc.nextDouble();

            System.out.print("Enter digit 2 :\t");
            double num2 = sc.nextDouble();

            System.out.print(
                    "Choose an operation to perform:\t [ 1. Add | 2. Substract | 3. Multiply | 4. Divide ]\n\n =>");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println(num1 + " X " + num2 + " = " + result);
                    break;
                case 4:
                    if (num1 != 0 && num2 != 0) {
                        result = num1 / num2;
                        System.out.println(num1 + " / " + num2 + " = " + result);
                    }else{
                        System.out.println("Cannot perform division if one digit is 0");
                    }
                    break;
                default:
                    break;

            }
            System.out.print("perform another operation? [ y / n ] : \t");
            sc.nextLine();
            again = sc.nextLine();
            if (again.equalsIgnoreCase("n")) {
                repeat = false;
                System.out.println("Exiting Calculator...");
            }
        }
        sc.close();
        System.out.println("Thank You For Using the Calculator");

        // TODO: Perform the calculation based on the operator using conditions

        // TODO: Check if num2 is zero before performing division and display a warning
        // if true

        // TODO: Set 'again' to 'n' to stop the loop after one execution

        // TODO: Display a thank you message after the loop ends
    }
}
