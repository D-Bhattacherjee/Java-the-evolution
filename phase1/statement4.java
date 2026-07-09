package phase1;

import java.util.Scanner;

/**
 * statement4
 */
public class statement4 {

    public static void main(String[] args) {
        // Leap year checker
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Year to check if it is Leapyear or not :\t");
        int year = sc.nextInt();
        sc.close();
        
        // logic
        if (year%4 == 0 && year%400==0) {
            System.out.println(year+" is Leap-Year");
        } else {
            System.out.println(year+" is not a Leap-Year");            
        }
    }
}