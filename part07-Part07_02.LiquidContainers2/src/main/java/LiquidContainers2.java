
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            // System.out.print("> ");
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] tmp = input.split(" ");
            String command = tmp[0];
            int amount = Integer.valueOf(tmp[1]);
            if (command.equals("add")){
               first.add(amount);
            } else if (command.equals("move")){
                if (amount>=first.contains()){
                    second.add(first.contains());
                    first.remove(amount);
                } else {
                    first.remove(amount);
                    second.add(amount);
                }
            } else if (command.equals("remove")){
                second.remove(amount);
            }

        }
    }

}
