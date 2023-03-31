
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> list = new ArrayList<>();
        while (true) {
            System.out.println("Input the name of the book, empty stops:");
            String name = scanner.nextLine();
            if (name.isEmpty()){
                break;
            }
            System.out.println("Input the age recommendation:");
            int age = Integer.valueOf(scanner.nextLine());
            list.add(new Book(name, age));
        }
        Comparator<Book> comp = Comparator.comparing(Book::getAge).thenComparing(Book::getName);
        Collections.sort(list, comp);
        System.out.println(list.size() + " books in total.\n\nBooks:");
        list.stream().forEach(b -> System.out.println(b));
    }

}
