
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        ArrayList<Integer> numbers = new ArrayList<>();
        
        System.out.print("File? ");
        String file = scanner.nextLine();
        try (Scanner reader = new Scanner(Paths.get(file))){
            while (reader.hasNextLine()){
                int n = Integer.valueOf(reader.nextLine());
                numbers.add(n);
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " has failed.");
        }
        
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        for (Integer n : numbers){
            if (n>=lowerBound && n<=upperBound){
                total += 1;
            }
        }
        System.out.println("Numbers: " + total);
    }

}
