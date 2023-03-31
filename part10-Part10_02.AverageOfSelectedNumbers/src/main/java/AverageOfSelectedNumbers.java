
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<String> input = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }
            input.add(row);
        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String t = scanner.nextLine();
        if (t.equals("p")) {
            double avgPos = input.stream().mapToInt(s -> Integer.valueOf(s)).filter(n -> n > 0).average().getAsDouble();
            System.out.println("Average of the positive numbers: " + avgPos);
        } else if (t.equals("n")) {
            double avgNeg = input.stream().mapToInt(s -> Integer.valueOf(s)).filter(n -> n < 0).average().getAsDouble();
            System.out.println("Average of the negative numbers: " + avgNeg);
        }
    }
}
