
import java.util.Scanner;

public class AverageOfNumbers {

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
        if (count == 0) {
            System.out.println("Average of the numbers: 0");
        } else {
            System.out.println("Average of the numbers: " + ((double)sum/count));
        }
    }
}
