
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while(scanner.hasNextLine()){
            String row = scanner.nextLine();
            list.add(row);
        }
        list.stream().forEach(s -> System.out.println(s));
    }
}
