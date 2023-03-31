
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number");
        int n = scanner.nextInt();
        int f = 1;
        if (n!=0){
            for (int i = 2; i<=n;i++){
                f *= i;
            }
        }
        System.out.println("Factorial: " + f);
    }
}
