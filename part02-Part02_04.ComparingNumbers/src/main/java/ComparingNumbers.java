
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (x>y) {
            System.out.println(x + " is greater than " + y + ".");
        } else if (x<y) {
            System.out.println(x + " is smaller than " + y + ".");
        } else {
            System.out.println(x + " is equal to " + y + ".");
        }
    }
}
