
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JokeManager jMan = new JokeManager();
        UserInterface userInt = new UserInterface(jMan,scanner);
        userInt.start();
    }
}
