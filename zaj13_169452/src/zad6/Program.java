package zad6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean run = true;
        while(run)
            try {
                System.out.println("podaj a: ");
                int a = scanner.nextInt();
                System.out.println("podaj b: ");
                int b = scanner.nextInt();
                int c = a/b;
                System.out.println("wynik dzielenia to " + c);
                run = false;
            }
            catch (InputMismatchException e) {
                System.out.println("daj liczbe calkowita pls");
                scanner.nextLine();
            }
            catch (ArithmeticException e) {
                System.out.println("nie dziel przez zero pls");
            }

    }

}
