
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int total = 0;
        int max = 0;
        String maxName = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            sum += Integer.valueOf(parts[1]);
            total += 1;
            if (parts[0].length()>max){
                max = parts[0].length();
                maxName = parts[0];
            }
        }
        System.out.println("Longest name: " + maxName);
        System.out.println("Average of the birth years: " + ((double)sum/total));

    }
}
