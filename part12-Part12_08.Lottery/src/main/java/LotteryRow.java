
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        Random rng = new Random();
        while(this.numbers.size()<7){
            int n = rng.nextInt(40)+1;
            if(!this.containsNumber(n)){
                this.numbers.add(n);
            }
        }
    }

    public boolean containsNumber(int number) {
        return this.numbers.contains(number);
    }
}

