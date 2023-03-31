
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
    }
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){
        for (Integer n : numbers) {
            if (n>=lowerLimit && n<=upperLimit){
                System.out.println(n);
            }
        }
    }
}
