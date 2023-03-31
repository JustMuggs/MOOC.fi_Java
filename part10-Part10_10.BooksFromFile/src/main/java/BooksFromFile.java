
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }

    public static List<Book> readBooks(String file) {
        ArrayList<Book> books = new ArrayList<>();
        try {
            Files.lines(Paths.get(file)).map(s -> s.split(",")).map(b -> new Book(b[0], Integer.valueOf(b[1]), Integer.valueOf(b[2]), b[3])).forEach(b -> books.add(b));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return books;
    }
}
