
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String s = scanner.nextLine();
            if (s.equals("")){
                break;
            }
            String[] array = s.split(" ");
            for (String x : array){
                System.out.println(x);
            }
        }

    }
}
