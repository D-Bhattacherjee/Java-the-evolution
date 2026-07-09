package phase1;

import java.util.Scanner;

public class statement2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a nuber to even or odd:\t");
        int n = sc.nextInt();

        if (n%2==0) {
            System.out.println(n + "\tis Eeven");
        }else{
            System.out.println(n + "\tis Odd");
        }

        sc.close();
    }
}
