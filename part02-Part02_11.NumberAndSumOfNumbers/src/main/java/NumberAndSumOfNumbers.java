
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int n;
        while (true) {
            System.out.println("Give a number:");
            n = scanner.nextInt();
            if (n==0) {
                break;
            }
            sum += n;
            count += 1;
        }
        System.out.println("Number of numbers: " + count);
        System.out.println("Sum of the numbers: " + sum);
    }
}
