
import java.util.Scanner;

public class AverageOfPositiveNumbers {

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
            } else if (n>0) {
                sum += n;
                count += 1;
            }
        }
        if (count == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(((double)sum/count));
        }
    }
}
