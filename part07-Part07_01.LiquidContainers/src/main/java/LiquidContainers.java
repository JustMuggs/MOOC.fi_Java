
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            // System.out.print("> ");
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] tmp = input.split(" ");
            String command = tmp[0];
            int amount = Integer.valueOf(tmp[1]);
            if (command.equals("add") && amount>0){
                    first += amount;
                    if (first>100){
                        first = 100;
                    }
            } else if (command.equals("move") && amount>0){
                if (amount>=first){
                    second += first;
                    first = 0;
                } else {
                    first -= amount;
                    second += amount;
                }
                if (second>100){
                    second = 100;
                }
            } else if (command.equals("remove") && amount>0){
                second -= amount;
                if (second<0){
                    second = 0;
                }
            }
            
        }
    }

}
