
import java.util.Scanner;

public class UserInterface {

    private GradeRegister register;
    private Scanner scanner;

    public UserInterface(GradeRegister register, Scanner scanner) {
        this.register = register;
        this.scanner = scanner;
    }

    public void start() {
        readPoints();
        printGradeDistribution();
    }

    public void readPoints() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("-1")) {
                break;
            }

            int points = Integer.valueOf(input);

            if (points < 0 || points > 100) {
                continue;
            }

            this.register.addGradeBasedOnPoints(points);
        }
    }

    public void printGradeDistribution() {
        System.out.println("Point average (all): " + this.register.averageOfPoints());
        if(this.register.averageOfPassing()!=-1){
            System.out.println("Point average (passing): " + this.register.averageOfPassing());
        } else {
            System.out.println("Point average (passing): -");
        }
        System.out.println("Pass percentage: " + this.register.passPercentage());
        System.out.println("Grade distribution:");
        int grade = 5;
        while (grade >= 0) {
            int stars = register.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printsStars(stars);
            System.out.println("");

            grade = grade - 1;
        }
        
    }

    public static void printsStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
}
