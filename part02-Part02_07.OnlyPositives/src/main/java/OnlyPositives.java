
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        while (true) {
            System.out.println("Give a number:");
            n = scanner.nextInt();
            if (n<0) {
                System.out.println("Unsuitable number");
            } else if (n>0) {
                System.out.println(n*n);
            } else {
                break;
            }
        }
    }
}
