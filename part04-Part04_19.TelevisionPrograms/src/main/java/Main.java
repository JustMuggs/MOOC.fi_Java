import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Name:");
            String nam = scanner.nextLine();
            if (nam.isEmpty()){
                break;
            }
            System.out.println("Duration:");
            int dur = Integer.valueOf(scanner.nextLine());
            TelevisionProgram tp = new TelevisionProgram(nam,dur);
            programs.add(tp);
        }
        System.out.println("Program's maximum duration?");
        int max = scanner.nextInt();
        for (TelevisionProgram tp : programs){
            if (tp.getDuration()<=max){
                System.out.println(tp);
            }
        }
    }
}
