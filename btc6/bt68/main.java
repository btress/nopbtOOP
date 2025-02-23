package bt68;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();

                System.out.println(x / y);
                break;
            }
        }catch (InputMismatchException e) {
            System.out.println("aa");
            scanner.nextLine();
        }
        System.out.println();
    }
}
