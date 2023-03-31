
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        String maxName = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            if (Integer.valueOf(parts[1])>max){
                max = Integer.valueOf(parts[1]);
                maxName = parts[0];
            }
        }
        System.out.println("Name of the oldest: " + maxName);

    }
}
