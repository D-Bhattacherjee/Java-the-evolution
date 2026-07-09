package phase1;

import java.util.Scanner;

public class statement3 {
    public static void main(String[] args) {

        System.out.println("|  WELCOME TO HEAT CONVERTION PROGRAMM  |");

        Scanner sc = new Scanner(System.in);
        System.out.println("Choice:\t1. Celsius to Farenheit\t2. Farenheight to Celsius");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: 
                System.out.print("Enter the temparature in Celsius:");
                double temp = sc.nextDouble();

                double mod = (temp * 10) / 100;

                double CtoF = ((temp*2) - mod) + 32;

                System.out.println(temp+"F = "+CtoF+"C");
                break;

            case 2:
                System.out.print("Enter the temparature in Farenheit:");
                double tempC = sc.nextDouble();

                double FtoC = ((tempC - 32)*5)/9;

                System.out.println(tempC+"C = "+FtoC+"F");
                break;
        
            default: System.out.println("Programm aborted | No choices selected");
                break;
        }

        sc.close();
    }
}
