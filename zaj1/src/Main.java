import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj 10 liczb całkowitych:");

        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt();
            numberList.add(number);
        }

        System.out.println("Wprowadzone liczby w odwrotnym porządku:");

        Collections.reverse(numberList); // Odwracamy kolejność elementów na liście

        for (int number : numberList) {
            System.out.println(number);
        }

        scanner.close();
    }
}