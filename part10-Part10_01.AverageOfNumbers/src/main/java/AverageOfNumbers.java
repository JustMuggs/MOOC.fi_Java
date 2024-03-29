
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        ArrayList<String> input = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true){
            String row = scanner.nextLine();
            if (row.equals("end")){
                break;
            }
            input.add(row);
            double avg = input.stream().mapToInt(s -> Integer.valueOf(s)).average().getAsDouble();
            System.out.println("Average of numbers: " + avg);
        }
    }
}
