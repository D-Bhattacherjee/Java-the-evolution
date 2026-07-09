package phase1;

import java.util.Scanner;

public class statement5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\nEnter any number to get a multiplication table :\t");
        int num = sc.nextInt();
        sc.close();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num+" X "+i+" = "+(num*i));
        }
    }
}
