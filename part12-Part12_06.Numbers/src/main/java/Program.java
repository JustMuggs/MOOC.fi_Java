
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rng = new Random();
        System.out.println("How many random numbers should be printed?");
        int n = Integer.valueOf(scanner.nextLine());
        while(n>0){
            System.out.println(rng.nextInt(11));
            n--;
        }
    }

}
