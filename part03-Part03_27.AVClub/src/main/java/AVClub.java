
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String s = scanner.nextLine();
            if (s.equals("")){
                break;
            }
            String[] array = s.split(" ");
            for (String x : array){
                if (x.contains("av")){
                    System.out.println(x);
                }
            }
        }

    }
}
