
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        BirdDatabase birds = new BirdDatabase();
        while (true) {
            System.out.println("?");
            String input = scan.nextLine();
            if (input.equals("Quit")){
                break;
            } else if (input.equals("Add")){
                System.out.println("Name:");
                String name = scan.nextLine();
                System.out.println("Name in Latin:");
                String latinName = scan.nextLine();
                Bird bird = new Bird(name,latinName);
                birds.addBird(name, latinName);
            } else if (input.equals("Observation")){
                System.out.println("Bird?");
                String name = scan.nextLine();
                birds.addObs(name);
            } else if (input.equals("One")){
                System.out.println("Bird?");
                String name = scan.nextLine();
                System.out.println(birds.getBird(name));
            } else if (input.equals("All")){
                System.out.println(birds);
            }
        }
    }

}
