
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int n;
        while (true) {
            System.out.println("Give a number:");
            n = scanner.nextInt();
            if (n == 0) {
                break;
            } else if (n < 0) {
                total += 1;
            }
        }
        System.out.println("Number of negative numbers: " + total);
    }
}
