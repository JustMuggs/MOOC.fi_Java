
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        List<Lit> output = new ArrayList<>();
        
        try {
            Files.lines(Paths.get("literacy.csv")).map(s -> s.replace(" (%)", "")).map(row -> row.trim().split(","))
                    .map(p -> new Lit(p[3],Integer.valueOf(p[4]),Double.valueOf(p[5]),p[2])).forEach(p -> output.add(p));
            output.stream().sorted().forEach(p -> System.out.println(p));
            
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
